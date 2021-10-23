package com.ebstecnologia.api.controle.equipamentos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "produto_saida")
public class ProdutoSaida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String produtoDecricao;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate localDate;

    @Column
    @JsonFormat(pattern = "hh:mm")
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;


    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;



    @PrePersist
    public void data(){
        setLocalDate(LocalDate.now());
        setTime(LocalTime.now());
    }
}
