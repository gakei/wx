package com.pjqdyd.service;

import com.pjqdyd.utils.WxHttpUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RequestSessionIDImpl implements RequestSessionID {
    public static final String APPID = "wx6fa89d17a498b854"; //申请小程序的AppId
    public static final String APP_SECRET = "c72a43d54c1eecbfa96f982a278459d9"; //生成的AppSecret
    //请求微信后端的地址
    public static final String AUTH_URL = "https://api.weixin.qq.com/sns/jscode2session?appid={appid}&secret={secret}&js_code={js_code}&grant_type={grant_type}";

    /**
     * @description:向微信服务端请求session_key
     * @param code wx.login()获取的code
     * @return java.lang.String
     * @author WHJ
     * @date 2021/3/24 12:16
     */
    @Override
    public Map<String, String> requestSessionID(String code) throws Exception {
        //装载请求参数的Map集合,通过code,appid,app_secret获取用户的OpenId
        Map<String, String> paramsMap = new HashMap<>();
        paramsMap.put("appid", APPID);
        paramsMap.put("secret", APP_SECRET);
        paramsMap.put("js_code", code);
        paramsMap.put("grant_type", "authorization_code");

        //获取用户的SessionID
        Map<String, String> resultMap = new WxHttpUtil().getWxOpenIdAndSkey(AUTH_URL, paramsMap);
        return resultMap;
    }
}
