package com.ebstecnologia.api.controle.equipamentos.controller.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class StandardError {
    private Integer status;
    private String msg;
    private Long timeStamp;

    public StandardError() {
    }
}

