package com.ebstecnologia.api.controle.equipamentos.services.setorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.SetorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetorServiceUpdate {

    private final SetorRepository setorRepository;
    private final SetorServiceFindById setorServiceFindById;

    public void setorUpdate(Integer id, Setor setorAtualizado){
       Setor setor =  setorServiceFindById.findById(id);
        setor.setId(id);
        setor.setSetorNome(setorAtualizado.getSetorNome());
        setor.setTelefone(setorAtualizado.getTelefone());
        setor.setRamal(setorAtualizado.getRamal());
        setorRepository.save(setor);

    }
}
