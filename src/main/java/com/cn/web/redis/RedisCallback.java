package com.cn.web.redis;

import redis.clients.jedis.Jedis;

public interface RedisCallback {

    Object doWithRedis(Jedis jedis);
}