package com.ebstecnologia.api.controle.equipamentos.service.softwareService;

import com.ebstecnologia.api.controle.equipamentos.repositories.SoftwareRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SoftwareServiceDelete {

    private final SoftwareRepository repository;

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
