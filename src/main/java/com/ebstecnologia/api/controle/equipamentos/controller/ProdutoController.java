package com.ebstecnologia.api.controle.equipamentos.controller;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@AllArgsConstructor
@CrossOrigin("https://ti-suporte-front-end.herokuapp.com")
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return produtoService.save(produto);
    }
    @GetMapping
    public List<Produto> produtoList(){
        return produtoService.produtoList();
    }
    @GetMapping("{id}")
    public Produto bucarPorId(@PathVariable Integer id){
        return produtoService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        produtoService.deletProduto(id);
    }
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@PathVariable Integer id, @RequestBody Produto produtoAtualizado){
        produtoService.update(id, produtoAtualizado);
    }
}
