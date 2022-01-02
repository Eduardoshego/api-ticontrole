package com.ebstecnologia.api.controle.equipamentos.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class PaginatorConfiguration implements WebMvcConfigurer {
    //Configuração da paginação
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
         PageableHandlerMethodArgumentResolver pageableHandler = new PageableHandlerMethodArgumentResolver();
         pageableHandler.setFallbackPageable(PageRequest.of(0, 5));
         resolvers.add(pageableHandler);
    }
}
