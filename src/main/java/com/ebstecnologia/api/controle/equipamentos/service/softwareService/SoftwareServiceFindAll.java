package com.ebstecnologia.api.controle.equipamentos.service.softwareService;

import com.ebstecnologia.api.controle.equipamentos.model.Software;
import com.ebstecnologia.api.controle.equipamentos.repositories.SoftwareRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SoftwareServiceFindAll {

    private final SoftwareRepository repository;

    public List<Software> listAll(){
        return repository.findAll();
    }
}
