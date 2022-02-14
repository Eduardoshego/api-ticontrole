package com.ebstecnologia.api.controle.equipamentos.services;

import com.ebstecnologia.api.controle.equipamentos.model.ServicoPrestado;
import com.ebstecnologia.api.controle.equipamentos.repositories.ServicoPrestadoRepository;
import com.ebstecnologia.api.controle.equipamentos.services.computadorServices.ComputadorServiceFindById;
import com.ebstecnologia.api.controle.equipamentos.services.exceptions.MyObjectNotFoundException;
import com.ebstecnologia.api.controle.equipamentos.services.impressoraServices.ImpressoraFindByIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicoPrestadosService {

    private final ServicoPrestadoRepository servicoRepository;
    private final ComputadorServiceFindById computador;
    private final ImpressoraFindByIdService impressoraService;




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
