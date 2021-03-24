package com.pjqdyd.utils;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.security.MessageDigest;

@Component
public class EncryptUtil {
    public final String KEY_SHA = "SHA";
    //使用SHA算法加密session_key
    public BigInteger encrypt(String session_key) {
        BigInteger sha = null;
        byte[] inputData = session_key.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
            messageDigest.update(inputData);
            sha = new BigInteger(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sha;
    }
}
