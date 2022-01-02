package com.ebstecnologia.api.controle.equipamentos.services.util;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Data
@Configuration
public class GeraID {
    private char[] alfabeto = {'0','1','2','3','4','A','B','C','D'};
    private int size = 4;

    public String geradorDeId(){
            Random random = new Random();
           return NanoIdUtils.randomNanoId(random,getAlfabeto(),getSize());


    }
}
