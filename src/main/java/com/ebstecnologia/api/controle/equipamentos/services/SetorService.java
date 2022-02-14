package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.SetorDTO;
import com.ebstecnologia.api.controle.equipamentos.controllers.dto.SetorUpdateDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.SetorRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class SetorService {

    private final SetorRepository setorRepository;

    public Setor save(SetorDTO setorDTO){
        Setor setor = new Setor();
        setor.setSetorNome(setorDTO.getNome());
        setor.setTelefone(setorDTO.getTelefone());
        setor.setRamal(setorDTO.getRamal());
        return setorRepository.save(setor);



    }
    public List<Setor> findAll(){
        return setorRepository.findAll();
    }
    public Setor findById(Integer id){
        return setorRepository.findById(id)
                .orElseThrow(
                        ()->new MyObjectNotFoundException("Setor não encontrado com esse id: " + id)
                );
    }
    public void deleteById(Integer id){
        setorRepository.findById(id);
    }
    public void update(Integer id, SetorUpdateDTO sectorActualized){

        setorRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(
                        HttpStatus.NOT_FOUND
                ));
        Setor setor = new Setor();
        setor.setId(id);
        setor.setSetorNome(sectorActualized.getNome());
        setor.setTelefone(sectorActualized.getTelefone());
        setor.setRamal(sectorActualized.getRamal());
        setorRepository.save(setor);




    }

}
