package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProdutoSaidaDTO {
    private Integer idSetor;
    private Integer idProduto;
    private Integer quant;
}
