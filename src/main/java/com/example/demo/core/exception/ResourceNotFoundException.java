package com.example.demo.core.exception;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(String errorCode){
        super(errorCode);
    }

    public ResourceNotFoundException(){}
}