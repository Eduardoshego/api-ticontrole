package com.ebstecnologia.api.controle.equipamentos.controllers.exception.exceptionComputador;

import com.ebstecnologia.api.controle.equipamentos.controllers.exception.StandardError;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.computadorExceptions.MyExceptionSectorConflicts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandlerConflictSetor {

    @ExceptionHandler(MyExceptionSectorConflicts.class)
    public ResponseEntity<StandardError> setoresDiferentes(MyExceptionSectorConflicts e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.BAD_REQUEST.value());
        err.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);

    }
    @ExceptionHandler(javax.validation.UnexpectedTypeException.class)
    public ResponseEntity<StandardError> notEmpty(javax.validation.UnexpectedTypeException e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NO_CONTENT.value());
        err.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(err);
    }

}
