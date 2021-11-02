package com.ebstecnologia.api.controle.equipamentos.service.exception;

public class MyObjectNotFoundException extends RuntimeException{

    public MyObjectNotFoundException(String msg){
        super(msg);
    }
    public MyObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
