package com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto;

public class MyExceptionSemEstoque extends RuntimeException{

    public MyExceptionSemEstoque(String msg){
        super(msg);
    }
    public MyExceptionSemEstoque(String msg , Throwable cause){
        super(msg, cause);
    }
}
