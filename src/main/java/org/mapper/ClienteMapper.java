package org.example.mapper;

import org.example.model_loc.Cliente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements RowMapper<Cliente> {
    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(rs.getInt("id_cliente"));
        cliente.setNomeCliente(rs.getString("nome_cliente").trim());
        cliente.setDthPrimeiralocacao(rs.getString("dth_primeiralocacao"));
        return cliente;
    }
}
