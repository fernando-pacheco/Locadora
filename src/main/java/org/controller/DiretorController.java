package org.example.controller;

import org.example.model_loc.Cliente;
import org.example.model_loc.Diretor;
import org.example.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {
    @Autowired
    private LocadoraService service;
    @GetMapping
    public List<Diretor> buscarDiretor(){
        return service.obterDiretor();
    }
}
