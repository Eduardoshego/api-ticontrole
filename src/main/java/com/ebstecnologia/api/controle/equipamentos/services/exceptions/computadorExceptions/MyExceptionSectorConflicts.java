package com.ebstecnologia.api.controle.equipamentos.services.exceptions.computadorExceptions;

public class MyExceptionSectorConflicts extends RuntimeException{

    public MyExceptionSectorConflicts(String msg){
        super(msg);
    }
    public MyExceptionSectorConflicts(String msg, Throwable cause){
        super(msg, cause);
    }
}
