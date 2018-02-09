package com.sosoneo.util;

import java.io.Serializable;

/**
 * Created by sosoneo on 2018/2/9.
 */
public class ResponseResult<T> implements Serializable {
    private String desc;
    private String code;
    private T data;

    public ResponseResult() {
    }
    public ResponseResult(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public ResponseResult(String code, T data) {
        this.code = code;
        this.data = data;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "ResponseResult{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}
