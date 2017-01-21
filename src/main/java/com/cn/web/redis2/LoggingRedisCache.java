package com.cn.web.redis2;

/**
 * Describe:
 * User:tangjing
 * Date:17/1/14
 * Time:下午3:49
 */

import org.apache.ibatis.cache.decorators.LoggingCache;

public class LoggingRedisCache extends LoggingCache{

    public LoggingRedisCache(String id) {
        super(new RedisCache(id));
        // TODO Auto-generated constructor stub
    }

}