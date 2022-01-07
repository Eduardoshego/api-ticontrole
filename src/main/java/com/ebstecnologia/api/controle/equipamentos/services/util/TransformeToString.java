package com.ebstecnologia.api.controle.equipamentos.services.util;

import org.springframework.context.annotation.Configuration;

import java.net.Inet4Address;

@Configuration
public class TransformeToString {

    public String transformeIp(String ip){
        ip.replaceAll("[^0-9]+","");
        return ip;

    }
}
