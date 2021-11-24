package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Monitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String modelo;

    @Column
    private String marca;

    @Column(nullable = false, name = "num_serie")
    private String numSerie;

    @Column(nullable = false)
    private int polegadas;

    @OneToOne
    private Computador computador;
}
