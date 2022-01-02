package com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices;

import com.ebstecnologia.api.controle.equipamentos.repositories.EstabilizadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstabilizadorServiceDeleteById {

    private final EstabilizadorRepository estabilizadorRepository;
    private final EstbilizadorServiceFindById estbilizadorServiceFindById;

    public void deleteById(Integer id){
        estbilizadorServiceFindById.findById(id);
        estabilizadorRepository.deleteById(id);
    }
}
