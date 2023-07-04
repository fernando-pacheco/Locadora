package org.example.mapper;

import org.example.model_loc.Cliente;
import org.example.model_loc.Locacao;
import org.example.repository.LocadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;



public class LocacaoClienteDvdMapper implements RowMapper<Locacao> {
    @Autowired
    private LocadoraRepository dvdService;
    @Override
    public Locacao mapRow(ResultSet rs, int rowNum) throws SQLException {
        Locacao locacao = new Locacao();
        locacao.setIdLocacao(rs.getInt("id_locacao"));
        locacao.setDthLocacao(rs.getString("dth_locacao"));
        locacao.setValorLocacao(rs.getInt("valor_locacao"));

        Cliente cliente = new Cliente();
        cliente.setIdCliente(rs.getInt("id_cliente"));
        cliente.setNomeCliente(rs.getString("nome_cliente").trim());
        cliente.setDthPrimeiralocacao(rs.getString("dth_primeiralocacao"));
        locacao.setCliente(cliente);

        //ESTAMOS AQUI NA AULA obterDvdbyId
        //Dvd dvd = dvdService.obterdvdbyId();
        //locacao.setDvd(rs.getInt("fk.dvd"));

        return locacao;
    }
}
