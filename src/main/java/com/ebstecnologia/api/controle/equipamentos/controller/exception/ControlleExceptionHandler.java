package com.ebstecnologia.api.controle.equipamentos.controller.exception;

import com.ebstecnologia.api.controle.equipamentos.service.exception.MyExceptionSemEstoque;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.service.exception.NumeroSerieNotNull;
import net.bytebuddy.asm.Advice;
import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class ControlleExceptionHandler {

    @ExceptionHandler(MyObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(MyObjectNotFoundException e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setTimeStamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
    @ExceptionHandler(MyExceptionSemEstoque.class)
    public ResponseEntity<StandardError> semEstoque(MyExceptionSemEstoque e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setTimeStamp(System.currentTimeMillis());
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NO_CONTENT.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<StandardError> numeroSerieNotNull(NumeroSerieNotNull e , HttpServletRequest request){
        StandardError err = new StandardError();
        err.setTimeStamp(System.currentTimeMillis());
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
}