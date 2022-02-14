package com.ebstecnologia.api.controle.equipamentos.controllers.exception.execptionsImpressora;

import com.ebstecnologia.api.controle.equipamentos.controllers.exception.StandardError;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.impressora.CompartilhamentoImpressoraException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServlet;

@ControllerAdvice
public class ValidationHandlerImpressoraValidationSave {

    @ExceptionHandler(CompartilhamentoImpressoraException.class)
    public ResponseEntity<StandardError> validationSaveImpressora(CompartilhamentoImpressoraException e, HttpServlet request){
        StandardError err = new StandardError();
        err.setStatus(HttpStatus.CONFLICT.value());
        err.setTimeStamp(System.currentTimeMillis());
        err.setMsg(e.getMessage());
        return  ResponseEntity.status(HttpStatus.CONFLICT).body(err);
    }
}
