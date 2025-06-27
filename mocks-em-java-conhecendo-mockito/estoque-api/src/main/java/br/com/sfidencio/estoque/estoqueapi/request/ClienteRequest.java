package br.com.sfidencio.estoque.estoqueapi.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClienteRequest {
    private String nome;
    private BigDecimal limiteCredito;
}
