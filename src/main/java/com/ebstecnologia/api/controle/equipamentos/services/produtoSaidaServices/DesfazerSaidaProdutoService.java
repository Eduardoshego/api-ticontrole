package com.ebstecnologia.api.controle.equipamentos.services.produtoSaidaServices;

import com.ebstecnologia.api.controle.equipamentos.model.Produto;
import com.ebstecnologia.api.controle.equipamentos.model.ProdutoSaida;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.exceptionsProduto.MyExceptionForaDoPrazoDeExclusao;
import com.ebstecnologia.api.controle.equipamentos.services.produtoServices.ProdutoServiceUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class DesfazerSaidaProdutoService {

    private final ProdutoSaidaServiceFindById produtoSaidaServiceFindById;
    private final ProdutoSaidaDeleteById produtoSaidaDeleteById;
    private final ProdutoServiceUpdate produtoServiceUpdate;

    public void desfazerSaida(Integer id){
        ProdutoSaida produtosaida = produtoSaidaServiceFindById.findById(id);
//        DateTimeFormatter dataAgora = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        dataAgora.format(LocalTime.now());
        LocalDate dataAgora = LocalDate.now();
        System.out.println("Data agora: " + dataAgora + " dataBanco: " + produtosaida.getLocalDate());

        System.out.println(dataAgora);
         if(dataAgora.equals(produtosaida.getLocalDate())){
             Produto produto = produtosaida.getProduto();
                produto.setQuantidade(produtosaida.getQuantProdutoSaida() + produto.getQuantidade() );
                produtoServiceUpdate.produtoUpdate(produto.getId(), produto);
                produtoSaidaDeleteById.deleteById(produtosaida.getId());

         }
         else{
             throw new MyExceptionForaDoPrazoDeExclusao(
                     "Não é possível desfazer esse lançamento, " +
                             "Motivo: Lançamento fora do prazo de exclusão: " +
                             " Data da saída:  " + produtosaida.getLocalDate() +
                             " Data hoje: " + dataAgora
             );
        }

    }

}
