package com.cn.web.redis;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/13
 * Time:下午5:53
 */

import com.cn.web.util.SerializeUtil;
import org.apache.ibatis.cache.Cache;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * Cache adapter for Redis.
 *
 * @author Eduardo Macarron
 */
public final class RedisCache implements Cache {

    private static JedisPool pool;

    private final ReadWriteLock readWriteLock = new DummyReadWriteLock();
    private final String id;

    private final Integer expireSeconds;

    public RedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        this.id = id;
        final RedisConfig redisConfig = RedisConfigurationBuilder.getInstance().parseConfiguration();
        pool = new JedisPool(redisConfig,
                redisConfig.getHost(),
                redisConfig.getPort(),
                redisConfig.getConnectionTimeout(),
                redisConfig.getSoTimeout(),
                redisConfig.getPassword(),
                redisConfig.getDatabase(),
                redisConfig.getClientName(),
                false,
                null,
                null,
                null
        );
        expireSeconds = redisConfig.getSettings().get(id) * 60;
    }

    @Override
    public void clear() {
        execute(new RedisCallback() {
            @Override
            public Object doWithRedis(Jedis jedis) {
                Set<String> keys = jedis.keys("*"+id+"*");
                for (String string : keys) {
                    jedis.del(string.toString());
                }
                return null;
            }
        });
    }

    private Object execute(RedisCallback callback) {
        final Jedis jedis = pool.getResource();
        try {
            return callback.doWithRedis(jedis);
        } finally {
            jedis.close();
        }
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Object getObject(final Object key) {
        return execute(new RedisCallback() {
            @Override
            public Object doWithRedis(Jedis jedis) {
                // return SerializeUtil.unserialize(jedis.hget(id.toString().getBytes(),
                // key.toString().getBytes()));
                return SerializeUtil.unserialize(jedis.get(key.toString().getBytes()));
            }
        });
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }

    @Override
    public int getSize() {
        return (Integer) execute(new RedisCallback() {
            @Override
            public Object doWithRedis(Jedis jedis) {
                throw new UnsupportedOperationException("not support redis-cache getsize method.");
            }
        });
    }

    @Override
    public void putObject(final Object key, final Object value) {
        execute(new RedisCallback() {
            @Override
            public Object doWithRedis(Jedis jedis) {
                System.out.println("缓存----------------:" + key);
                jedis.set(key.toString().getBytes(), SerializeUtil.serialize(value));
                if (expireSeconds > 0) {
                    jedis.expire(key.toString().getBytes(), expireSeconds);
                }
                // jedis.hset(id.toString().getBytes(), key.toString().getBytes(),
                // SerializeUtil.serialize(value));
                return null;
            }
        });
    }

    @Override
    public Object removeObject(final Object key) {
        return execute(new RedisCallback() {
            @Override
            public Object doWithRedis(Jedis jedis) {
                // return jedis.hdel(id.toString(), key.toString());
                // return jedis.del(key.toString());

                throw new UnsupportedOperationException("not support redis-cache getsize method.");
            }
        });
    }

    @Override
    public String toString() {
        return "Redis {" + id + "}";
    }

}