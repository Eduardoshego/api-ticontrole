package com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto;

public class MyExceptionForaDoPrazoDeExclusao extends RuntimeException {

    public MyExceptionForaDoPrazoDeExclusao(String msg){
        super(msg);
    }
    public MyExceptionForaDoPrazoDeExclusao(String msg , Throwable cause){
        super(msg, cause);
    }
}
