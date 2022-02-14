package com.ebstecnologia.api.controle.equipamentos.controllers.dto;

import lombok.Data;

@Data
public class CadastroPessoaDTO {

    private String nome;
    private String numTelefone;
    private String email;
    private Integer cargo_id;
}
