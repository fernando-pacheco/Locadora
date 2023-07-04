package org.example.controller;

import org.example.model_loc.Dvd;
import org.example.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dvd")
public class DvdController {
    @Autowired
    private LocadoraService service;
    @GetMapping
    public List<Dvd> buscarDvd(){
        return service.obterDvd();
    }
}
