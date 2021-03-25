package com.wx.controller;

import com.wx.dto.UserInfoDTO;
import com.wx.service.RequestSessionID;
import com.wx.service.StoreInRedis;
import com.wx.service.UserInsert;
import com.wx.utils.EncryptUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
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
    @Autowired
    private StoreInRedis storeInRedis;
    @Autowired
    private UserInsert userInsert;

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

        //获取session_key和openid
        Map<String, String> resultMap = requestSessionID.requestSessionID(code);
        String session_key = resultMap.get("session_key");
        String openid = resultMap.get("openid");
        //加密sessionKey
        BigInteger encryptedSessionKey = encryptUtil.encrypt(session_key);

        //生成一个唯一字符串sessionid作为键，将openid和session_key作为值，存入redis，超时时间设置为2小时
        storeInRedis.store(encryptedSessionKey.toString(), session_key, openid);

        //TODO:将用户数据保存入数据库
        userInsert.userInsert(userInfoDTO);

        return "Success";
    }
}
