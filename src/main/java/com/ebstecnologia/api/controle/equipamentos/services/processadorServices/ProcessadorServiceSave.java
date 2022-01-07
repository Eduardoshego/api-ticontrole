package com.ebstecnologia.api.controle.equipamentos.services.processadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProcessadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessadorServiceSave {

    private final ProcessadorRepository repository;

    public Processador save(Processador processador){
       return repository.save(processador);
    }
}
