package com.cocacola.bmp.common;

import org.springframework.http.HttpStatus;

public class ResultData {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultData ok() {
        return new ResultData(HttpStatus.OK.value(), HttpStatus.OK.name(), "");
    }

    public static ResultData ok(Object data) {
        return new ResultData(HttpStatus.OK.value(), HttpStatus.OK.name(), data);
    }

    public static ResultData err(Object data) {
        return new ResultData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "err", data);
    }

    public ResultData(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
