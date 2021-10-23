package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SetorUpdateDTO {
    private String nome;
    private String email;
    private String telefone;
    private String ramal;
    private Integer idSupervisor;
    private Integer id;
}
