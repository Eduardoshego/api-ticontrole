package com.ebstecnologia.api.controle.equipamentos.services.setorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.SetorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SetorServiceFindById {

    private final SetorRepository setorRepository;

    public Setor  findById(Integer id){
        return setorRepository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Nenhum registro foi recuperado informe a consulta novamente"
                )
        );
    }
}
