package com.ebstecnologia.api.controle.equipamentos.controller.exception;

import com.ebstecnologia.api.controle.equipamentos.service.exception.MyExceptionSemEstoque;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class ControlleExceptionHandler {


    @ExceptionHandler(MyExceptionSemEstoque.class)
    public ResponseEntity<StandardError> semEstoque(MyExceptionSemEstoque e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setTimeStamp(System.currentTimeMillis());
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NO_CONTENT.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

}
