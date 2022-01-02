package com.ebstecnologia.api.controle.equipamentos.service.exception.Computador;

public class MyExceptionSectorConflicts extends RuntimeException{

    public MyExceptionSectorConflicts(String msg){
        super(msg);
    }
    public MyExceptionSectorConflicts(String msg, Throwable cause){
        super(msg, cause);
    }
}
