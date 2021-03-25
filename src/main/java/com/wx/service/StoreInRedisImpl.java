package com.wx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author WHJ
 * @description
 * @create 2021-03-24 17:23
 **/
@Service
public class StoreInRedisImpl implements StoreInRedis {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void store(String encryptedSessionKey, String session_key, String openid) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String openidSessionKey = session_key + "," + openid;
        ops.set(String.valueOf(encryptedSessionKey), openidSessionKey, 7200, TimeUnit.SECONDS);
    }
}
