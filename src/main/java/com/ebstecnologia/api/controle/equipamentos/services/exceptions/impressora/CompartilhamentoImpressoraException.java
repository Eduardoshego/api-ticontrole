package com.ebstecnologia.api.controle.equipamentos.services.exceptions.impressora;

public class CompartilhamentoImpressoraException extends RuntimeException{

    public CompartilhamentoImpressoraException(String msg){
        super(msg);
    }
    public CompartilhamentoImpressoraException(String msg , Throwable cause){
        super(msg, cause);
    }
}
