package com.ebstecnologia.api.controle.equipamentos.model;

import lombok.Data;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cargoDescricao;

    @OneToMany
    private List<CadastroPessoas> cadastroPessoasList;
}
