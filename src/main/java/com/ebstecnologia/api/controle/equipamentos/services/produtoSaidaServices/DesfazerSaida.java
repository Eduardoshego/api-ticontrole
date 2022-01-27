package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto.MyExceptionForaDoPrazoDeExclusao;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class DesfazerSaida {

    private final ProdutoSaidaServiceFindById produtoSaidaServiceFindById;
    private final ProdutoSaidaDeleteById produtoSaidaDeleteById;
    private final ProdutoServiceUpdate produtoServiceUpdate;

    public void desfazerSaida(Integer id){
        ProdutoSaida produtosaida = produtoSaidaServiceFindById.findById(id);
         LocalDate dataHoje = LocalDate.now();
         if(dataHoje == produtosaida.getLocalDate()){
             Produto produto = produtosaida.getProduto();
                produto.setQuantidade(produtosaida.getQuantProdutoSaida() + produto.getQuantidade() );
                produtoServiceUpdate.produtoUpdate(produto.getId(), produto);
                produtoSaidaDeleteById.deleteById(produtosaida.getId());

         }
         else{
             throw new MyExceptionForaDoPrazoDeExclusao(
                     "Não é possível desfazer esse lançamento contate o suporte! "
             );
        }

    }

}
