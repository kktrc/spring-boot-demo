package com.panda.demo.cache;

import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisCache implements Cache {


    @Resource
    private RedisTemplate<String, Object> redisTemplate;


    @Override
    public boolean put(String key, Object value) {
        redisTemplate.opsForValue().set(key, value, 1, TimeUnit.DAYS);
        return true;
    }

    @Override
    public Object getByKey(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean refresh() {
        return false;
    }
}
