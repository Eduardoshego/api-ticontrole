package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import lombok.Data;

@Data
public class ServicoPrestadoDto {

     private Integer computadorId;
     private Integer impressoraId;
     private String descricaoServico;

}
