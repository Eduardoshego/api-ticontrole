package com.ebstecnologia.api.controle.equipamentos.controller.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.spi.ManagedEntity;

import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Data
public class ComputadorDTO {

    // Ids de objetos


    @NotEmpty(message = "Processador não pode ser vazio ou  nulo")
    private Integer processadorId;
    @NotEmpty(message = "Switch não pode ser vazio ou nulo" )
    private Integer switchId;
    @NotEmpty(message = "Setor não pode ser vazio ou nulo")
    private Integer setorId;
    @NotEmpty(message = "Ip não pode ser vazio ou nulo")
    private Integer ipId;
    private Integer softwareId;
    private Integer impressoraId;

    //Proriedades do computador
    @NotEmpty(message = "Host name não pode ser vazio ou nulo")
    private String nomeComputador;
    @NotEmpty(message = "Marca não pode ser vazio ou nulo" )
    private String marca;
    @NotEmpty(message = "Modelo não pose vazio ou nulo")
    private String modelo;






}
