package com.example.api.exception;

public class UserNotFoundException extends Exception{
    private int user_id;
    public UserNotFoundException(int user_id){
        super(String.format("User is not found"));
    }
}
