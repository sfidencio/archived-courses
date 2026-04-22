package br.com.sfidencio.estoque.estoqueapi.response;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ClienteResponse {
    private Long id;
    private String nome;
    private BigDecimal limiteCredito;
}
