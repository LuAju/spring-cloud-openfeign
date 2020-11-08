package com.ju.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result<T> {
    private T result;

    private String msg;

    private ResultCode resultCode;


    public Result<T> buildSuccess(T t){
        return new Result<>(t, "", ResultCode.SUCCESS);
    }

    public Result<T> buildFail(String msg){
        return new Result<>(null, msg, ResultCode.FAIL);
    }
}
