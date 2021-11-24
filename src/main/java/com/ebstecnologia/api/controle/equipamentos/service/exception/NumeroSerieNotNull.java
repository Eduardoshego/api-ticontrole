package com.ebstecnologia.api.controle.equipamentos.service.exception;

public class NumeroSerieNotNull extends RuntimeException{

    public NumeroSerieNotNull(String msg){
        super(msg);
    }
    public NumeroSerieNotNull(String msg, Throwable cause){
        super(msg, cause);
    }
}
