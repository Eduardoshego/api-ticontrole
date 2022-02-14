package com.ebstecnologia.api.controle.equipamentos.services.setorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.SetorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetorServiceSave {

    private final SetorRepository setorRepository;

    public Setor saveSetor(Setor setor){
        return setorRepository.save(setor);
    }
}
