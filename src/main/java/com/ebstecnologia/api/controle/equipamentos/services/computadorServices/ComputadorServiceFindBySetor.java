package com.ebstecnologia.api.controle.equipamentos.services.computadorServices;


import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.repositories.computadoresRepository.ComputadorRepositoryFindBySetor;
import com.ebstecnologia.api.controle.equipamentos.services.util.ChecksIfSearchAndEmpty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputadorServiceFindBySetor {

    private final ChecksIfSearchAndEmpty check;
    private final ComputadorRepositoryFindBySetor findBySetor;

    public List<Computador> listPorSetor(String nome){
        return check.checksIfSearchAndEnpty("%" + nome + "%");
    }
}
