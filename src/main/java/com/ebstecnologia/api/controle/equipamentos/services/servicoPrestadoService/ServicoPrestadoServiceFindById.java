package com.ebstecnologia.api.controle.equipamentos.services.servicoPrestadoService;

import com.ebstecnologia.api.controle.equipamentos.model.ServicoPrestado;
import com.ebstecnologia.api.controle.equipamentos.repositories.ServicoPrestadoRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.services.util.MessageNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoPrestadoServiceFindById {

    private final ServicoPrestadoRepository repository;
    private final MessageNotFound msg;

    public ServicoPrestado findById(Integer id){
        return repository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        msg.getMessage()
                )
        );
    }

}
