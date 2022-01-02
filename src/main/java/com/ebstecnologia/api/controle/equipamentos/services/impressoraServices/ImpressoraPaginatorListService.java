package com.ebstecnologia.api.controle.equipamentos.services.impressoraServices;

import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImpressoraPaginatorListService {

    private final ImpressoraRepositroy impRepo;

    public Page<Impressora> pageList(Pageable pageable){
        return impRepo.findAll(pageable);
    }
}
