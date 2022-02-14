package com.ebstecnologia.api.controle.equipamentos.services.util;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.repositories.computadoresRepository.ComputadorRepositoryFindBySetor;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.computadorExceptions.ExceptionEmptySearch;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class ChecksIfSearchAndEmpty {

    private final ComputadorRepositoryFindBySetor findBySetor;

    public List<Computador> checksIfSearchAndEnpty(String msg){
        System.out.println("Cheks: " + msg);
        List<Computador> list = findBySetor.findBySetor(msg);
        System.out.println(list);
        if(list.isEmpty()){
            throw new ExceptionEmptySearch(
                    "Nenhum dado foi recuperado refaça sua busca novamente!"
            );
        }
        else{
            return list;
        }
    }
}
