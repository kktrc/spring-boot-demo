package com.panda.demo.controller;

import com.panda.demo.cache.RedisCache;
import com.panda.demo.dataobject.UserDO;
import javax.annotation.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheTestController {



    @Resource
    private RedisCache redisCache;


    @GetMapping(value = "/testCache")
    public Object testCache() {

        UserDO userDO = new UserDO();
        userDO.setMobile("182043148888");


        redisCache.put("user", userDO);


        return redisCache.getByKey("user");
    }
}
