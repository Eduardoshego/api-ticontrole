package com.ebstecnologia.api.controle.equipamentos.service;

import com.ebstecnologia.api.controle.equipamentos.model.Servico;
import com.ebstecnologia.api.controle.equipamentos.repositories.ServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServicoService {

    private final ServicoRepository servicoRepository;
    public Servico save( Servico serv){
        return servicoRepository.save(serv);
    }
    public List<Servico> findAll(){
        return servicoRepository.findAll();
    }
    public void deletById(Integer id){
        servicoRepository.deleteById(id);
    }
    public Optional<Servico> findById(Integer id){
        return servicoRepository.findById(id);
    }
    public List<Servico> pesquisar(String nome, Integer  mes){
        return servicoRepository.findByNomeAndMes("%" + nome + "%", mes);
    }
}
