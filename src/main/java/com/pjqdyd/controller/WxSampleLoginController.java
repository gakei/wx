package com.pjqdyd.controller;

import com.pjqdyd.dto.UserInfoDTO;
import com.pjqdyd.service.RequestSessionID;
import com.pjqdyd.utils.EncryptUtil;
import com.pjqdyd.utils.WxHttpUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/**   
 * @Description:  [微信小程序简单登录接口, 只获取Openid和基本信息,不包括UnionID,基本信息由前端传入]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@RestController
@RequestMapping("/wx/sample")
public class WxSampleLoginController {
    @Autowired
    private EncryptUtil encryptUtil;
    @Autowired
    private RequestSessionID requestSessionID;

    /**
     * 登录接口
     * @param code 前端wx.login获取的code
     * @return
     */
    @PostMapping("/login")
    public String wxLogin(@RequestParam("code") String code,
                          @RequestBody UserInfoDTO userInfoDTO) throws Exception{

        if (StringUtils.isBlank(code)){
            return "失败-code不能为空";
        }

        //获取session_key
        String session_key = requestSessionID.requestSessionID(code);
        //加密sessionKey
        BigInteger encryptSessionKey = encryptUtil.encrypt(session_key);

        //TODO:将用户数据保存入数据库

        return "Success";
    }

}
