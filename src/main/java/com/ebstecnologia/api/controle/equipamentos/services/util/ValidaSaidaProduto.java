package com.ebstecnologia.api.controle.equipamentos.services.util;

import com.ebstecnologia.api.controle.equipamentos.controllers.dto.ProdutoSaidaDTO;
import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto.MyExceptionVerificaEstoque;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceFindById;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class ValidaSaidaProduto {

    private final ProdutoServiceFindById produtoServiceFindById;


    public void validaSaida(ProdutoSaidaDTO produtoSaidaDTO){
        Produto produto = produtoServiceFindById.findById(produtoSaidaDTO.getIdProduto());
        if(produtoSaidaDTO.getQuant() <= 0) {
            throw new MyExceptionVerificaEstoque(
                    "Quantidade de produto ao ser lançada não pode ser menor ou igual a 0"
            );

        }
        if(produtoSaidaDTO.getQuant() > produto.getQuantidade()){
            throw new MyExceptionVerificaEstoque(
                    "Saldo do produto: "
                            + produto.getDescricao()
                            + " insuficiente"
            );
        }

    }

}
