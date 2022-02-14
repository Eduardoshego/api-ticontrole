package com.ebstecnologia.api.controle.equipamentos.controllers.exception.exceptionComputador;

import com.ebstecnologia.api.controle.equipamentos.controllers.exception.StandardError;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.computadorExceptions.ExceptionEmptySearch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerChecksIfSearchAndEmpty {

    @ExceptionHandler(ExceptionEmptySearch.class)
    public ResponseEntity<StandardError> exceptionEmptySearch(ExceptionEmptySearch e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}
