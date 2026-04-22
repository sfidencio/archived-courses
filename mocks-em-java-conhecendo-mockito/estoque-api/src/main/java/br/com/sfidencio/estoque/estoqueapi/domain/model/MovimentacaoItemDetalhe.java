package br.com.sfidencio.estoque.estoqueapi.domain.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovimentacaoItemDetalhe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal preco;
    private BigDecimal quantidade;
    @ManyToOne
    private Produto produto;
}
