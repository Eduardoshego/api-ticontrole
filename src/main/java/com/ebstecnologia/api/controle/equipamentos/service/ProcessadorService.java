package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Processador;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProcessadorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

        return processadorRepository.findById(id).orElseThrow(()-> new
                ResponseStatusException(HttpStatus.NOT_FOUND,"Processador não encontrado"));
    }
    public void deletById(Integer id){
        processadorRepository.deleteById(id);
    }
}

