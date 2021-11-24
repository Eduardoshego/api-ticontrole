package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.CadastroPessoaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.CadastroPessoas;
import com.ebstecnologia.api.controle.equipamentos.model.Cargo;
import com.ebstecnologia.api.controle.equipamentos.repositories.CadastroPessoasRepository;
import com.ebstecnologia.api.controle.equipamentos.repositories.CargoRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.service.util.GeraID;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CadastroPessoasService {

    private final CadastroPessoasRepository cadastroRepository;
    private final CargoService cargoService;
    GeraID geraID;



    public CadastroPessoas save(CadastroPessoaDTO cad){
       CadastroPessoas obj = new CadastroPessoas();
       obj.setId(geraID.geradorDeId());
       obj.setCargo(cargoService.findById(cad.getCargo_id()));
       obj.setEmail(cad.getEmail());
       obj.setNome(cad.getNome());
       return obj;

    }
    public List<CadastroPessoas> findAll(){
        return cadastroRepository.findAll();
    }
    public void deleteById(String id){
        cadastroRepository.deleteById(id);
    }
    public CadastroPessoas findById(String  id){
        return cadastroRepository.findById(id)
                .orElseThrow(
                        ()-> new MyObjectNotFoundException("Cadastro não encontrado id: "
                                + id
                        ));
    }

    public void update(String id, CadastroPessoas sup) {
        CadastroPessoas obj = findById(id);
        obj.setId(id);
        cadastroRepository.save(obj);

    }
}
