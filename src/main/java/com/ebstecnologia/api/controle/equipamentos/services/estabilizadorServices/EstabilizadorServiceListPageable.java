package com.ebstecnologia.api.controle.equipamentos.services.estabilizadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.repositories.EstabilizadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstabilizadorServiceListPageable {

    private final EstabilizadorRepository estabilizadorRepository;

    public Page<Estabilizador> listPage(Pageable pageable){
        return estabilizadorRepository.findAll(pageable);
    }
}
