package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// Classe responsável por desfazer uma saída de produto por id;
@Service
@RequiredArgsConstructor
public class ProdutoSaidaDeleteById {

    private final ProdutoSaidaRepository produtoSaidaRepository;
    private final ProdutoSaidaServiceFindById produtoSaidaServiceFindById;

    public void deleteById(Integer id){
        produtoSaidaServiceFindById.findById(id);
        produtoSaidaRepository.deleteById(id);
    }
}
