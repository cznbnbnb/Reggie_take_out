package com.chenzheng.reggie.exception;
//抛出自定义异常
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
