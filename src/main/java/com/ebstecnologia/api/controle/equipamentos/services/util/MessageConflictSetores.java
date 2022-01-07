package com.ebstecnologia.api.controle.equipamentos.services.util;


import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class MessageConflictSetores {

    private String msg;

    public String alert(String  nameComputer, String nameImpressora){

       return msg = "Impressora não pode ser adcionada a um computador em setores diferentes:" +
                "Setor computador: " + nameComputer
                + "Setor impressora: " + nameImpressora;

    }
}
