package com.ebstecnologia.api.controle.equipamentos.controllers.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProdutoSaidaDTO {
    private Integer idSetor;
    private Integer idProduto;
    private Integer quant;
}
