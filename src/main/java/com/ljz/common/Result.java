package com.ljz.common;

import com.alibaba.fastjson.JSON;

/**
 *
 *  统一 API 响应结果封装
 * Created by liangjiazhang on 2017/7/15.
 */
public class Result {

    /**
     * 响应码
     */
    private  int code;

    /**
     * 响应信息描述
     */
    private String message;

    /**
     * 响应内容
     */
    private Object data;


    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }


    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setDate(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


}
