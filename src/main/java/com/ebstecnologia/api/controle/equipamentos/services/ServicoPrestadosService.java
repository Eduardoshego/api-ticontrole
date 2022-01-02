package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.controller.DTO.ServicoPrestadoDto;
import com.ebstecnologia.api.controle.equipamentos.model.Computador;
import com.ebstecnologia.api.controle.equipamentos.model.Impressora;
import com.ebstecnologia.api.controle.equipamentos.model.ServicoPrestado;
import com.ebstecnologia.api.controle.equipamentos.repositories.ServicoRepository;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicoPrestadosService {

    private final ServicoRepository servicoRepository;
    private final ComputadorServiceFindById computador;
    private final ImpressoraService impressoraService;


    public ServicoPrestado save(ServicoPrestadoDto servDto){

        ServicoPrestado obj =  new ServicoPrestado();

        if (servDto.getComputadorId() != null){
            Computador  comp = computador.findById(servDto.getComputadorId());
            obj.setComputador(comp);

        }
        else{
             Impressora impressora = impressoraService.findById(servDto.getImpressoraId());
             obj.setImpressora(impressora);
        }

        obj.setDescricao(servDto.getDescricaoServico());
        return servicoRepository.save(obj);

    }

    public List<ServicoPrestado> findAll(){
        return servicoRepository.findAll();
    }

    public void deletById(Integer id){
        servicoRepository.deleteById(id);
    }

    public ServicoPrestado findById(Integer id){

        return servicoRepository.findById(id).orElseThrow(
                ()-> new MyObjectNotFoundException(
                        "Não existe Serviço prestado com esse id: " + id
                )
        );
    }

    public List<ServicoPrestado> pesquisar(String nome, Integer  mes){
        return servicoRepository.findByNomeAndMes("%" + nome + "%", mes);
    }
}
