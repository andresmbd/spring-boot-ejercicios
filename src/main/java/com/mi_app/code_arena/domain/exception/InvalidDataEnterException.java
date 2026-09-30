package com.mi_app.code_arena.domain.exception;

public class InvalidDataEnterException extends RuntimeException{
    public InvalidDataEnterException(String message){
        super(message);
    }
}
