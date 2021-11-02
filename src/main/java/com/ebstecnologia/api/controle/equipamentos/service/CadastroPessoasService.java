package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.CadastroPessoas;
import com.ebstecnologia.api.controle.equipamentos.repositories.CadastroPessoasRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
                        ()-> new MyObjectNotFoundException("Cadastro não encontrado id: "
                                + id
                        ));
    }

    public void update(Integer id, CadastroPessoas sup) {
        CadastroPessoas obj = findById(id);
        obj.setId(id);
        save(obj);

    }
}
