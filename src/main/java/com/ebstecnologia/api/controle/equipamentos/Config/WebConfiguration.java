package com.ebstecnologia.api.controle.equipamentos.Config;

import org.springframework.core.Ordered;
import org.springframework.web.filter.CorsFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilterRegistration(){

        CorsConfiguration conf = new CorsConfiguration();
        List<String> all = Arrays.asList("*");
        conf.setAllowedOrigins(all);
        conf.setAllowedHeaders(all);
        conf.setAllowedMethods(all);

        conf.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration("/**", conf);

        CorsFilter corsFilter = new CorsFilter(source);

        FilterRegistrationBean<CorsFilter> filter = new FilterRegistrationBean<>(corsFilter);

        filter.setOrder(Ordered.HIGHEST_PRECEDENCE);

        return filter;

    }
}
