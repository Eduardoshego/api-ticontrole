package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.repositories.ProdutoRepository;
import com.ebstecnologia.api.controle.equipamentos.service.exception.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }
    public List<Produto> produtoList(){
        return produtoRepository.findAll();
    }
    public Produto findById(Integer id){
        return produtoRepository.findById(id)
                .orElseThrow(
                        ()-> new MyObjectNotFoundException(
                                "Não existe produto com esse id: " + id )
                        );
    }
    public void deletProduto(Integer id){
        produtoRepository.deleteById(id);
    }
    public void update(Integer id, Produto produtoAtualizado)
    {
        Produto obj = findById(id);
        obj.setId(id);
        obj = produtoAtualizado;
        save(obj);
    }
}
