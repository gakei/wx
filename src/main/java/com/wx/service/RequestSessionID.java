package com.wx.service;

import java.util.Map;

public interface RequestSessionID {
    Map<String, String> requestSessionID(String code) throws Exception;
}
