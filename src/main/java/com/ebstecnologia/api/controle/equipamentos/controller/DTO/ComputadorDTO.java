package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ComputadorDTO {
    private Integer processadorId;
    private Integer memoriaId;
    private Integer switchId;
    private String nomeComputador;
    private String ip;
    private String marca;
    private String modelo;
    private Integer setorId;

}
