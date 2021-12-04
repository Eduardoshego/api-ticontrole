package com.ebstecnologia.api.controle.equipamentos.Config;

import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Collections;

@Configuration
public class WebConfiguration {

    @Bean
    public CorsConfigurationSource getConfigurationSource() {
        val source = new UrlBasedCorsConfigurationSource();
        val configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("http://localhost:4200");
        configuration.addAllowedOrigin("https://ti-suporte-front-end.herokuapp.com");
        val all = Collections.singletonList("*");
        configuration.setAllowedMethods(all);
        configuration.setAllowedHeaders(all);
        configuration.setExposedHeaders(all);
        configuration.setMaxAge(3600L);
        configuration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
