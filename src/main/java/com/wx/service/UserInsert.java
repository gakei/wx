package com.wx.service;

import com.wx.dto.UserInfoDTO;
import com.wx.mapper.UserMapper;
import com.wx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WHJ
 * @description 将UserInfoDTO转成User并插入数据库中
 * @create 2021-03-25 09:16
 **/
@Service
public class UserInsert {
    @Autowired
    UserMapper userMapper;
    public void userInsert(UserInfoDTO userInfoDTO) {
        User user = new User();
        user.setNickName(userInfoDTO.getNickName());
        user.setAvatarUrl(userInfoDTO.getAvatarUrl());
        user.setCity(userInfoDTO.getCity());
        user.setCountry(userInfoDTO.getCountry());
        user.setGender(userInfoDTO.getGender());
        user.setLanguage(userInfoDTO.getLanguage());
        user.setProvinces(userInfoDTO.getLanguage());
        user.setDescription("这人很懒，没有简介");
        user.setOpenId(userInfoDTO.getOpenId());
        userMapper.insert(user);
    }
}
