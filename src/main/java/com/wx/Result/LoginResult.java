package com.wx.Result;

import com.wx.dto.UserInfoDTO;

/**
 * @author WHJ
 * @description 登录结果
 * @create 2021-04-02 13:59
 **/
public class LoginResult extends Result<UserInfoDTO> {
    public LoginResult(ResultStatus status, String msg, UserInfoDTO data) {
        super(status, msg, data);
    }
    public static LoginResult success(String msg, UserInfoDTO userInfoDTO) {
        return new LoginResult(ResultStatus.OK, msg, userInfoDTO);
    }
    public static LoginResult fail(String msg) {
        return new LoginResult(ResultStatus.FAIL, msg, null);
    }
}
