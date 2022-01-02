package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProcessadorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProcessadorService {

    private final ProcessadorRepository processadorRepository;

    public Processador save(Processador processador){
        return processadorRepository.save(processador);
    }
    public List<Processador> findAll(){
        return processadorRepository.findAll();
    }
    public Processador findById(Integer id) {

        return processadorRepository
                .findById(id)
                .orElseThrow(
                        ()-> new MyObjectNotFoundException(
                                "Processador não encontrado com esse id:" + id));
    }
    public void deletById(Integer id){
        processadorRepository.deleteById(id);
    }
}

