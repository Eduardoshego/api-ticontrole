package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.RegistroImpressora;
import com.ebstecnologia.api.controle.equipamentos.repositories.RegistroImpressoraRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistroImpressoraService {
    private final RegistroImpressoraRepository registroImpressoraRepository;

    public RegistroImpressora save(RegistroImpressora reg){
        return registroImpressoraRepository.save(reg);
    }
    public RegistroImpressora findById(Integer id){
        return registroImpressoraRepository.findById(id)
                .orElseThrow(()->
                        new MyObjectNotFoundException(
                                "Não existe registro com esse id: " + id
                        ));
    }
    public List<RegistroImpressora> findAll(){
        return registroImpressoraRepository.findAll();
    }
    

}
