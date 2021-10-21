package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
public class RegistroImpressora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDate data;

    @Column
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "impressora_id")
    private Impressora impressora;

    @OneToOne
    private Setor setor;

    @Column(length = 100)
    private String alteracao;

    @PrePersist
    public void data(){
        setData(LocalDate.now());
        setTime(LocalTime.now());
    }
}
