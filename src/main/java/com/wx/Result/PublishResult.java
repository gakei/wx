package com.wx.Result;

/**
 * @author WHJ
 * @description 发布动态返回结果
 * @create 2021-04-02 11:17
 **/
public class PublishResult extends Result<Object> {
    public PublishResult(ResultStatus status, String msg, Object data) {
        super(status, msg, data);
    }
    public static PublishResult success(String msg) {
        return new PublishResult(ResultStatus.OK, msg, null);
    }
    public static PublishResult fail(String msg) {
        return new PublishResult(ResultStatus.FAIL, msg, null);
    }
}
