package org.example.service;

import org.example.model_loc.Cliente;
import org.example.model_loc.Diretor;
import org.example.model_loc.Dvd;
import org.example.model_loc.Locacao;
import org.example.repository.LocadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocadoraService {

    public final LocadoraRepository repository;

    @Autowired
    public LocadoraService(LocadoraRepository repository) {
        this.repository = repository;
    }


    public List<Cliente> obterCliente(){
        return repository.obterCliente();
    }

    public List<Diretor> obterDiretor(){
        return repository.obterDiretor();
    }
    public List<Dvd> obterDvd(){
        return repository.obterDvd();
    }
    public List<Locacao> obterLocacao(){
        return repository.obterLocacao();
    }

}
