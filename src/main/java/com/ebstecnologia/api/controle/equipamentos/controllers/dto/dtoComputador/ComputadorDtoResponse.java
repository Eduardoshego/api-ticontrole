package com.ebstecnologia.api.controle.equipamentos.controllers.dto.dtoComputador;

import lombok.Data;
import lombok.Setter;

@Data
public class ComputadorDtoResponse {

    private Integer id;
    private String hostName;
    private String nomeSetor;
    private String ip;
}
