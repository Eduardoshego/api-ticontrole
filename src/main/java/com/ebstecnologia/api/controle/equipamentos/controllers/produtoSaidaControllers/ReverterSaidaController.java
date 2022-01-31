package com.ebstecnologia.api.controle.equipamentos.controllers.produtoSaidaControllers;

import com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices.DesfazerSaidaProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/api/produtos-saidas/{id}")
public class ReverterSaidaController {

    private final DesfazerSaidaProdutoService desfazerSaidaProdutoService;

    @DeleteMapping
    public void reverterSaidaProduto(@PathVariable Integer id){
        desfazerSaidaProdutoService.desfazerSaida(id);
    }
}
