package com.ebstecnologia.api.controle.equipamentos.services.softwareServices;

import com.ebstecnologia.api.controle.equipamentos.model.Software;
import com.ebstecnologia.api.controle.equipamentos.repositories.SoftwareRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SoftwareServiceSave {

    private final SoftwareRepository repository;

    public Software save( Software software){
        return repository.save(software);
    }
}
