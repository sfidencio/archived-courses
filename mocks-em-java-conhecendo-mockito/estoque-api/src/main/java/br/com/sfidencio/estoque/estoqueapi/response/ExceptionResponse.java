package br.com.sfidencio.estoque.estoqueapi.response;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private String mensagem;
    private String urlRequisitada;
}
