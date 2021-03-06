package com.ebstecnologia.api.controle.equipamentos.controllers.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
public class ComputadorDTO {

    // Ids de objetos


    @NotNull(message = "Processador não pode ser vazio ou  nulo")
    private Integer processadorId;
    @NotNull(message = "Switch não pode ser vazio ou nulo" )
    private Integer switchId;
    @NotNull(message = "Setor não pode ser vazio ou nulo")
    private Integer setorId;
    @NotNull(message = "Ip não pode ser vazio ou nulo")
    private Integer ipId;
    private Integer impressoraId;
    private String patrimonio;

    //Proriedades do computador
    @NotEmpty(message = "Host name não pode ser vazio ou nulo")
    private String nomeComputador;
    @NotEmpty(message = "Marca não pode ser vazio ou nulo" )
    private String marca;
    @NotEmpty(message = "Modelo não pose vazio ou nulo")
    private String modelo;
    @NotEmpty
    private int quantRam;
    @NotEmpty
    private int quantDisco;
    @NotEmpty
    private String tipoDisco;






}
