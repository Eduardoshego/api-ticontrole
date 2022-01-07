package com.ebstecnologia.api.controle.equipamentos.services.processadorServices;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProcessadorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.services.util.MessageNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProcessadorServiceFindById {

    private final ProcessadorRepository repository;
    private final MessageNotFound msg;

    public Processador findById(Integer id){
        return repository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        msg.message()
                )
        );
    }
}
