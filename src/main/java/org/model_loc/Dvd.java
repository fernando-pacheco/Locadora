package org.example.model_loc;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Dvd {
    private int idDvd;
    private String nomeFilme;
    private Diretor diretor;
}
