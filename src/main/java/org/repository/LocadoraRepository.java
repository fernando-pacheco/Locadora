package org.example.repository;

import org.example.mapper.ClienteMapper;
import org.example.mapper.DiretorMapper;
import org.example.mapper.DvdMapper;
import org.example.mapper.LocacaoClienteDvdMapper;
import org.example.model_loc.Cliente;
import org.example.model_loc.Diretor;
import org.example.model_loc.Dvd;
import org.example.model_loc.Locacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocadoraRepository {

    @Autowired
    private final JdbcTemplate jdbctemplate;

    @Autowired
    public LocadoraRepository(JdbcTemplate jdbctemplate){
        this.jdbctemplate = jdbctemplate;
    }

    public List<Cliente> obterCliente(){
        String sql = "SELECT * FROM dbo.cliente";
        return jdbctemplate.query(sql, new ClienteMapper());
    }
    public List<Diretor> obterDiretor(){
        String sql = "SELECT * FROM dbo.diretor";
        return jdbctemplate.query(sql, new DiretorMapper());
    }
    public List<Dvd> obterDvd(){
        String sql = "SELECT * FROM dbo.dvd";
        return jdbctemplate.query(sql, new DvdMapper());
    }



    public List<Locacao> obterLocacao(){
        String sql = "SELECT * FROM dbo.locacao";
        return jdbctemplate.query(sql, new LocacaoClienteDvdMapper());
    }

}
