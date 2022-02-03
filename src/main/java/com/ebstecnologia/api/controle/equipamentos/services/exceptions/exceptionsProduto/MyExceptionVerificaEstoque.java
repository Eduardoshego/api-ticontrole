package com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto;

public class MyExceptionVerificaEstoque extends RuntimeException{

    public MyExceptionVerificaEstoque(String msg){
        super(msg);
    }
    public MyExceptionVerificaEstoque(String msg , Throwable cause){
        super(msg, cause);
    }
}
