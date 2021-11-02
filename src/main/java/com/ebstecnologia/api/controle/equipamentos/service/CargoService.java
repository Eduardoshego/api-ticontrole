package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Cargo;
import com.ebstecnologia.api.controle.equipamentos.repositories.CargoRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class CargoService {

    private final CargoRepository cargoRepository;

    public Cargo save(Cargo cargo){
        return cargoRepository.save(cargo);
    }
    public List<Cargo>findAll(){
        return cargoRepository.findAll();
    }
    public Cargo findById(Integer id){
        return cargoRepository.findById(id)
                .orElseThrow(
                        ()->new MyObjectNotFoundException(
                                "Não existe cargo cadastrado com esse id: " + id
                        )
                );
    }
    public void deleteById(Integer id){
        cargoRepository.deleteById(id);
    }
    public void update(Integer id, Cargo cargo ){
        findById(id);
        Cargo obj =  cargo;
        obj.setId(id);
        save(obj);
    }
}
