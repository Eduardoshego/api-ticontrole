package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ImpressoraService {

    private final ImpressoraRepositroy impressoraRepositroy;
    private final RegistroImpressoraService regImp;


    public Impressora save(Impressora imp){
        return impressoraRepositroy.save(imp);
    }
    public List<Impressora> findAll(){
        return impressoraRepositroy.findAll();
    }

    public Impressora findById(Integer id){
        return impressoraRepositroy.findById(id)
                .orElseThrow(
                        ()->new MyObjectNotFoundException(
                                "Impressora não encontrada com esse id: " + id
                        )
                );
    }
    public void update(Integer id, Impressora impressoraAtualizada){
        impressoraRepositroy.findById(id);
        Impressora obj = impressoraAtualizada;
        obj.setId(id);
        impressoraRepositroy.save(obj);



    }
}
