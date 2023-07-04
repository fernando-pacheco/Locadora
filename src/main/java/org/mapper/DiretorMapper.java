package org.example.mapper;

import org.example.model_loc.Diretor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DiretorMapper implements RowMapper<Diretor> {
    @Override
    public Diretor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Diretor diretor = new Diretor();
        diretor.setIdDiretor(rs.getInt("id_diretor"));
        diretor.setNomeDiretor(rs.getString("nome_diretor").trim());
        return diretor;
    }
}
