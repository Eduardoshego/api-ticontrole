package com.ebstecnologia.api.controle.equipamentos.services.exceptions;

public class MyObjectNotFoundException extends RuntimeException{

    public MyObjectNotFoundException(String msg){
        super(msg);
    }
    public MyObjectNotFoundException(String msg, Throwable cause){
        super(msg, cause);
    }
}
