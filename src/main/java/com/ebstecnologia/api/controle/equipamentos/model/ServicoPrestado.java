package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "servico")
@Entity
@Data
public class ServicoPrestado implements Serializable {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String descricao;

    @Column()
    private LocalDate data;

    @PrePersist
    public void dataServico(){
        setData(LocalDate.now());
    }

    @ManyToOne
    @JoinColumn(name = "computador_ID")
    private Computador computador;

    @ManyToOne
    @JoinColumn(name = "impressora_id")
    private Impressora impressora;


}