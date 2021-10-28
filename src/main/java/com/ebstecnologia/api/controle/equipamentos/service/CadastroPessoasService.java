package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.CadastroPessoas;
import com.ebstecnologia.api.controle.equipamentos.repositories.CadastroPessoasRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class CadastroPessoasService {

    private final CadastroPessoasRepository supervisorRepository;



    public CadastroPessoas save(CadastroPessoas sup){
       return supervisorRepository.save(sup);

    }
    public List<CadastroPessoas> findAll(){
        return supervisorRepository.findAll();
    }
    public void deleteById(Integer id){
        supervisorRepository.deleteById(id);
    }
    public CadastroPessoas findById(Integer id){
        return supervisorRepository.findById(id)
                .orElseThrow(
                        ()-> new ResponseStatusException(
                                HttpStatus.NOT_FOUND,"Supervisor não encontrado id:"+id
                        ));
    }

    public void update(Integer id, CadastroPessoas sup) {
        supervisorRepository.findById(id)
                .map(supervisor -> {
                    sup.setId(supervisor.getId());
                    return supervisorRepository.save(sup);
                })
                .orElseThrow(
                        () -> new ResponseStatusException(
                                HttpStatus.NOT_FOUND
                        )
                );

    }
}
