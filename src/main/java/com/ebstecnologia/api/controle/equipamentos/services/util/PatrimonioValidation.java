package com.ebstecnologia.api.controle.equipamentos.services.util;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PatrimonioValidation {

    public String patrimonioValidation(String patrimonio){

        if(patrimonio != null){
            return patrimonio;
        }
        else{
            return patrimonio = "Não informado";
        }

    }
}
