package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoSaidaServiceListPageable {

    private final ProdutoSaidaRepository repository;

    public List<ProdutoSaida> listAll(){
        return repository.findAll();
    }
}
