package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Software {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_soft",nullable = false, length = 40)
    private String nameSoft;

    @Column(name = "versao", nullable = false, length = 10)
    private String versao;

    @Column(name = "chave_license", length = 10)
    private String chaveLicense;

    @Column(name = "cod_license")
    private TipoLicencia codLicense;

    @ManyToOne
    @JoinColumn(name = "computador_id")
    private Computador computador;
}
