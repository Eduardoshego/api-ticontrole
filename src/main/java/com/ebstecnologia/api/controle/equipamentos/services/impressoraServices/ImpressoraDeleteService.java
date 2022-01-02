package com.ebstecnologia.api.controle.equipamentos.services.impressoraServices;

import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImpressoraDeleteService {

    private final ImpressoraRepositroy impRepo;
    private final ImpressoraFindByIdService impressoraFindByIdService;

    public void deleteById(Integer id){
        impressoraFindByIdService.findById(id);
        impRepo.deleteById(id);
    }
}
