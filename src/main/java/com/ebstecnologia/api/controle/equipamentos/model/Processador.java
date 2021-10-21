package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "processador")
@Entity
@Data
public class Processador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 5)
    private String marca;

    @Column(name = "freq_min", length = 10)
    private String freqMin;

    @Column(nullable = false, length = 15)
    private String modelo;

    @Column(name = "freq_max", nullable = false, length = 10)
    private String frequenciaMax;

    @Column(name = "quant_nucleo",nullable = false)
    private int quantNucleo;

    @Column(name = "quant_treads",nullable = false)
    private int quantThread;

    @Column()
    private String soquete;


}