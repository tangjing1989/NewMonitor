package com.cn.web.redis2;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/14
 * Time:下午3:48
 */

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisCache implements Cache {
    private static Log logger = LogFactory.getLog(RedisCache.class);
    private Jedis redisClient = createClient();
    /** The ReadWriteLock. */
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private String id;

    public RedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>MybatisRedisCache:id=" + id);
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public int getSize() {
        return Integer.valueOf(redisClient.dbSize().toString());
    }

    public void putObject(Object key, Object value) {
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>putObject:" + key + "=" + value);
        redisClient.set(SerializeUtil.serialize(key.toString()), SerializeUtil
                .serialize(value));
    }

    public Object getObject(Object key) {
        Object value = SerializeUtil.unserialize(redisClient.get(SerializeUtil
                .serialize(key.toString())));
        logger.debug(">>>>>>>>>>>>>>>>>>>>>>>>getObject:" + key + "=" + value);
        return value;
    }

    public Object removeObject(Object key) {
        return redisClient.expire(SerializeUtil.serialize(key.toString()), 0);
    }

    public void clear() {
        redisClient.flushDB();
    }

    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }

    protected static Jedis createClient() {
        try {
            JedisPool pool = new JedisPool(new JedisPoolConfig(),
                    "127.0.0.1",
                    32768,
                    10,
                    ""
                    );
            return pool.getResource();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("初始化连接池错误");
    }

}
