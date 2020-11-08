package com.ju.common.response;

import lombok.Data;

public enum ResultCode {

    SUCCESS(0,"成功"),FAIL(-1,"失败");
    private int code;
    private String info;

    ResultCode(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
