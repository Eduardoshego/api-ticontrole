package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SetorDTO {
    private String nome;
    private String email;
    private String telefone;
    private String ramal;
    private String idSupervisor;
}
