package com.ebstecnologia.api.controle.equipamentos.services.processadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProcessadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcessadorServiceListAll {

    private ProcessadorRepository repository;

    public List<Processador> processadorList(){
        return repository.findAll();
    }
}
