package com.ebstecnologia.api.controle.equipamentos.controllers.exception;

import lombok.Data;

@Data
public class StandardError {
    private Integer status;
    private String msg;
    private Long timeStamp;

    public StandardError() {
    }
}

