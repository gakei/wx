package com.wx.service;

/**
 * @author WHJ
 * @description 将openid,sessionid作为值，加密的sessionid作为键值存储到redis中
 * @create 2021-03-24 17:21
 **/
public interface StoreInRedis {
    void store(String encryptedSessionKey, String session_key, String openid);
}
