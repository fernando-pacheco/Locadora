package org.example.model_loc;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String dthPrimeiralocacao;
}
