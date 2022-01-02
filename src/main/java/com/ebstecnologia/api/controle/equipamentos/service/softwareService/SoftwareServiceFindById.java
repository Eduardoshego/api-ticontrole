package com.ebstecnologia.api.controle.equipamentos.service.softwareService;

import com.ebstecnologia.api.controle.equipamentos.model.Software;
import com.ebstecnologia.api.controle.equipamentos.repositories.SoftwareRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SoftwareServiceFindById {

    private final SoftwareRepository repository;

    public Software findByID( Integer id){
        Optional <Software> obj = repository.findById(id);
        return obj.orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Software não encontrado na base de dados"
                )
        );
    }

}
