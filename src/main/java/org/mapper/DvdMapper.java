package org.example.mapper;

import org.example.model_loc.Diretor;
import org.example.model_loc.Dvd;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DvdMapper implements RowMapper<Dvd> {
    @Override
    public Dvd mapRow(ResultSet rs, int rowNum) throws SQLException {
        Dvd dvd = new Dvd();
        Diretor diretor = new Diretor();
        dvd.setIdDvd(rs.getInt("id_dvd"));
        dvd.setNomeFilme(rs.getString("nome_filme").trim());
        dvd.setDiretor(diretor);
        return dvd;
    }
}
