package com.wy.web.util;

public class Result<T> {
    private Boolean success;//是否成功
    private T data; //返回数据
    private String error; //错误信息

    public Result() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.success = true;
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.success = false;
        this.error = error;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }

    public static <T> Result<T> fail(String error) {
        Result<T> result = new Result<>();
        result.setError(error);
        return result;
    }
}