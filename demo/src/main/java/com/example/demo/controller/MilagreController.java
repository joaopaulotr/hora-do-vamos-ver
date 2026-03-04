package com.example.demo.controller;

import com.example.demo.models.MilagreModel;
import com.example.demo.services.MilagreService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/milagre")
public class MilagreController {
    @Autowired
    private MilagreService milagreService;

    @PostMapping
    public MilagreModel criarMilagre(@RequestBody MilagreModel milagreModel){
        return  milagreService.criarMilagre(milagreModel);
    }

    @PostMapping("/{id}")
    public void deletarMilagre(@PathVariable Long id){
        milagreService.deletarMilagre(id);
    }

    @GetMapping
    public List<MilagreModel> listarMilagres(){
        return milagreService.listarMilagres();
    }

    @PostMapping("/{id}")
    public MilagreModel buscarMilagre(@PathVariable Long id){
        return milagreService.buscarMilagre(id);
    }

    @PutMapping("/{id}")
    public MilagreModel atualizarMilagre(@PathVariable Long id, @RequestBody MilagreModel milagreModel){
        return milagreService.atualizarMilagre(id, milagreModel);
    }

}
