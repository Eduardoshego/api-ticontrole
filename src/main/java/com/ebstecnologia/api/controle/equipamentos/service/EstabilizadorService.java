package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Estabilizador;
import com.ebstecnologia.api.controle.equipamentos.repositories.EstabilizadorRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EstabilizadorService {

    private final EstabilizadorRepository repository;

    public Estabilizador save(Estabilizador est){
        return repository.save(est);
    }
    public List<Estabilizador> listEstabilizador(){
        return repository.findAll();
    }
    public Estabilizador findById(Integer id){
        Optional<Estabilizador> obj = repository.findById(id);
        return obj.orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "ESTABILIZADOR NÃO ENCONTRADO COM ESSE ID:" + id
                )
        );

    }
    public void delete(Integer id){
        Estabilizador obj = findById(id);
        repository.delete(obj);
    }
    public void update(Estabilizador est, Integer id){
        Estabilizador obj = findById(id);
        obj.setId(id);
        obj.setComputador(est.getComputador());
        obj.setMarca(est.getMarca());
        obj.setModelo(est.getModelo());
        obj.setNumSerie(est.getNumSerie());
        obj.setPatrimonio(est.getPatrimonio());

    }
}
