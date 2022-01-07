package com.ebstecnologia.api.controle.equipamentos.services.util;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class MessageNotFound {

    private final String message = "Não encontrado na base de dados! Informe a consulta novamente";
}
