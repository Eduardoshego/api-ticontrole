package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.SetorDTO;
import com.ebstecnologia.api.controle.equipamentos.controller.DTO.SetorUpdateDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.model.CadastroPessoas;
import com.ebstecnologia.api.controle.equipamentos.repositories.SetorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class SetorService {

    private final SetorRepository setorRepository;
    private final CadastroPessoasService supService;

    public Setor save(SetorDTO setorDTO){
        CadastroPessoas supervisor = supService.findById(setorDTO.getIdSupervisor());
        Setor setor = new Setor();
        setor.setSupervisor(supervisor);
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
                        ()->new ResponseStatusException
                                (HttpStatus.NOT_FOUND, "Setor não encontrado com esse id: " + id)
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
        CadastroPessoas supervisor = supService.findById(sectorActualized.getIdSupervisor());
        Setor setor = new Setor();
        setor.setId(id);
        setor.setSetorNome(sectorActualized.getNome());
        setor.setEmail(sectorActualized.getEmail());
        setor.setTelefone(sectorActualized.getTelefone());
        setor.setRamal(sectorActualized.getRamal());
        setor.setSupervisor(supervisor);
        setorRepository.save(setor);




    }

}
