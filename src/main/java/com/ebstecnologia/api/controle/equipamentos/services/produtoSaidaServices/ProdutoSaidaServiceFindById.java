package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoSaidaServiceFindById {

    private final ProdutoSaidaRepository repository;

    public ProdutoSaida findById(Integer id){
        return  repository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Nenhum registro de saida foi recuperado verifique a pesquisa e tente novamente"
                )
        );
    }
}
