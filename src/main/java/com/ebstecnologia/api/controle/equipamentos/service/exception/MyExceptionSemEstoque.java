package com.ebstecnologia.api.controle.equipamentos.service.exception;

public class MyExceptionSemEstoque extends RuntimeException{

    public MyExceptionSemEstoque(String msg){
        super(msg);
    }
    public MyExceptionSemEstoque(String msg , Throwable cause){
        super(msg, cause);
    }
}
