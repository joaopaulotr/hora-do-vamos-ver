package com.example.demo.services;

import com.example.demo.models.MilagreModel;
import com.example.demo.repositories.MilagreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class MilagreService {

    @Autowired
    private MilagreRepository milagreRepository;

    public MilagreModel criarMilagre(MilagreModel milagreModel){
        return  milagreRepository.save(milagreModel);
    }

    public void deletarMilagre(Long id){
        milagreRepository.deleteById(id);
    }

    public List<MilagreModel> listarMilagres(){
        return milagreRepository.findAll();
    }

    public MilagreModel buscarMilagre(Long id){
        return milagreRepository.findById(id).get();
    }

    public MilagreModel atualizarMilagre(Long id, MilagreModel milagreModel){
        MilagreModel newMilagre =  milagreRepository.findById(id).get();
        newMilagre.setNome(milagreModel.getNome());
        return   milagreRepository.save(newMilagre);
    }
}
