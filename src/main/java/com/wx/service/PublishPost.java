package com.wx.service;

import com.wx.Result.PublishResult;

import java.util.Map;

/**
 * @author WHJ
 * @description 发布动态接口
 * @create 2021-04-01 18:24
 **/
public interface PublishPost {
    PublishResult insertPost(Map<String, Object> param);
}
