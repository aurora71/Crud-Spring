package com.crao.crud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;


@Service
public class RedisService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "redisTemplate")
    public ValueOperations<String, String> valueOperations;

    public String getValue(String key){
        return valueOperations.get(key);
    }

    public void setValue(String key, String val){
        valueOperations.set(key, val);
    }

    public void setValue(String key, String val, int time){
        valueOperations.set(key, val, time, TimeUnit.SECONDS);
    }
}
