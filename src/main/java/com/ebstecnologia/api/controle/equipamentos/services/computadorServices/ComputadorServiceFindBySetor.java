package com.ebstecnologia.api.controle.equipamentos.services.computadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.repositories.computadoresRepository.ComputadorRepositoryFindBySetor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputadorServiceFindBySetor {

    private final ComputadorRepositoryFindBySetor computadorRepositoryFindBySetor;

    public List<Computador> findBySetor(String name){
        return computadorRepositoryFindBySetor.findBySetor( "%" +name + "%");
    }
}
