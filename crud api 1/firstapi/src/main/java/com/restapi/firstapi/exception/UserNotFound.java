package com.restapi.firstapi.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UserNotFound extends RuntimeException{
    
    public UserNotFound(String message){
        super(message); //without cause exception
    }

    public UserNotFound(String message, Throwable throwable){
        super(message, throwable); //with cause exception
    }
}
