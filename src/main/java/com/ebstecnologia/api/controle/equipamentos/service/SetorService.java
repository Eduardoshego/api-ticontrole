package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Setor;
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

    public Setor save(Setor set){
        return setorRepository.save(set);

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
    public void update(Integer id, Setor setor){
        setorRepository.findById(id)
                .map(produto -> {
                    setor.setId(produto.getId());
                    return setorRepository.save(setor);
                }).orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
                );
    }

}
