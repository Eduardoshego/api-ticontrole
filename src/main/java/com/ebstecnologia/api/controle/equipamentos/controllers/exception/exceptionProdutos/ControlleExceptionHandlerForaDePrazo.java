package com.ebstecnologia.api.controle.equipamentos.controllers.exception.exceptionProdutos;

import com.ebstecnologia.api.controle.equipamentos.controllers.exception.StandardError;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto.MyExceptionForaDoPrazoDeExclusao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControlleExceptionHandlerForaDePrazo {


    @ExceptionHandler(MyExceptionForaDoPrazoDeExclusao.class)
    public ResponseEntity<StandardError> semEstoque(MyExceptionForaDoPrazoDeExclusao e, HttpServletRequest request){
        StandardError err = new StandardError();
        err.setTimeStamp(System.currentTimeMillis());
        err.setMsg(e.getMessage());
        err.setStatus(HttpStatus.NO_CONTENT.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

}
