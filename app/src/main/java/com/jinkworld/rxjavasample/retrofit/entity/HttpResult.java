package com.jinkworld.rxjavasample.retrofit.entity;

/**
 * Created by Zellerpooh on 16/10/20.
 */

public class HttpResult<T> {
    private int resultCode;
    private String resultMessage;

    private T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
