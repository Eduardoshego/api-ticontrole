package com.ebstecnologia.api.controle.equipamentos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
public class ProdutoEntrada {

    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String produtoDecricao;

    @Column(nullable = false)
    private int quant;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate localDate;

    @Column
    @JsonFormat(pattern = "hh:mm")
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;





    @PrePersist
    public void data(){
        setLocalDate(LocalDate.now());
        setTime(LocalTime.now());
    }
}


