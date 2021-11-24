package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import com.ebstecnologia.api.controle.equipamentos.model.Cargo;
import com.ebstecnologia.api.controle.equipamentos.model.Setor;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Data
public class CadastroPessoaDTO {

    private String nome;
    private String numTelefone;
    private String email;
    private Integer cargo_id;
}
