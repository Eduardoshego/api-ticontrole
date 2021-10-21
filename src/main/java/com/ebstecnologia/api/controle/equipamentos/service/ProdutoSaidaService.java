package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.ebstecnologia.api.controle.equipamentos.repositories.ImpressoraRepositroy;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoRepository;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoSaidaRepository;
import com.ebstecnologia.api.controle.equipamentos.repositories.SetorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoSaidaService {
    private final ProdutoSaidaRepository produtoSaidaRepository;
    private final ProdutoService produtoService;
    private final ImpressoraService impressoraService;
    private final SetorService setorService;

    public ProdutoSaida save(ProdutoSaidaDTO produtoSaidaDTO){
        Produto produto = produtoService.findById(produtoSaidaDTO.getIdProduto());
        Impressora impressora = impressoraService.findById(produtoSaidaDTO.getIdImpressora());
        Setor setor = setorService.findById(produtoSaidaDTO.getIdSetor());
        if ( produto == null  ){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto inválido");
        }
        if (impressora == null){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Impressora inválida");
        }
        if (setor == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Setor inválido");
        }
        ProdutoSaida produtoSaida = new ProdutoSaida();
        produtoSaida.setImpressora(impressora);
        produtoSaida.setSetor(setor);
        produtoSaida.setProduto(produto);
        return produtoSaidaRepository.save(produtoSaida);
    }
    public List<ProdutoSaida> listProdutoSaida(){
        return produtoSaidaRepository.findAll();
    }

}
