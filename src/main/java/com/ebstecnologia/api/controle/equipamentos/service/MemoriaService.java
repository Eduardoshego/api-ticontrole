package com.ebstecnologia.api.controle.equipamentos.service;

import java.util.List;

import com.ebstecnologia.api.controle.equipamentos.model.Memoria;
import com.ebstecnologia.api.controle.equipamentos.repositories.MemoriaRepository;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemoriaService {

    private final MemoriaRepository memoriaRepository;

    public Memoria save(Memoria memoria){
        return memoriaRepository.save(memoria);
    }
    public void deleteById(Integer id){
        memoriaRepository.deleteById(id);
    }
    public Memoria findById(Integer id){
        return memoriaRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "NÃO EXISTE MEMORIA COM ESSE ID"));
    }
    public List<Memoria> findAll(){
        return memoriaRepository.findAll();
    }
}
