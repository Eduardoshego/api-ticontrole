package com.ebstecnologia.api.controle.equipamentos.controllers.exception.objectNotFound;

import com.ebstecnologia.api.controle.equipamentos.controllers.exception.StandardError;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ObjectNotFound {

    @ExceptionHandler(MyObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(MyObjectNotFoundException e, HttpServletRequest request) {
        StandardError err = new StandardError();
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
