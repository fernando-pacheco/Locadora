package org.example.controller;

import org.example.model_loc.Locacao;
import org.example.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {
    @Autowired
    private LocadoraService service;
    @GetMapping
    public List<Locacao> buscarLocacao(){
        return service.obterLocacao();
    }
}