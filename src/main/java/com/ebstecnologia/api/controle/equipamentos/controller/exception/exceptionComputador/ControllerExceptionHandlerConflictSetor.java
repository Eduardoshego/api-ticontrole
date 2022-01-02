package com.ebstecnologia.api.controle.equipamentos.controller.exception.exceptionComputador;

import com.ebstecnologia.api.controle.equipamentos.controller.exception.StandardError;
import com.ebstecnologia.api.controle.equipamentos.service.exception.Computador.MyExceptionSectorConflicts;
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

}
