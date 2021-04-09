package com.wx.Result;

/**
 * @author WHJ
 * @description 返回结果抽象类
 * @create 2021-04-02 11:14
 **/
public abstract class Result<T> {
    public enum ResultStatus {
        OK(2000),
        FAIL(2001);

        private Integer status;

        ResultStatus(Integer status) {
            this.status = status;
        }
    }
    ResultStatus status;
    String msg;
    T data;

    public Result(ResultStatus status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status.status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
