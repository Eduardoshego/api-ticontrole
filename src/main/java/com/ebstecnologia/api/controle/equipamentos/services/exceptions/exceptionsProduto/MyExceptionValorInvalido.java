package com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto;

public class MyExceptionValorInvalido extends RuntimeException{

    public MyExceptionValorInvalido(String msg){
        super(msg);
    }
    public MyExceptionValorInvalido(String msg , Throwable cause){
        super(msg, cause);
    }
}
