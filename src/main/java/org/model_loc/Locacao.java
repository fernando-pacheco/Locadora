package org.example.model_loc;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Locacao {
    private Integer idLocacao;
    private Integer valorLocacao;
    private String dthLocacao;
    private Cliente cliente;
    private Dvd dvd;
}
