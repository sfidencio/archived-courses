package br.com.sfidencio.estoque.estoqueapi.domain.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
//@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String descricao;
    @Getter
    @Setter
    private BigDecimal estoque;
    @Getter
    @Setter
    private BigDecimal preco;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "produto_id")
    private List<MovimentacaoItemDetalhe> itens = new ArrayList<>();

    public List<MovimentacaoItemDetalhe> getItens() {
        return Collections.unmodifiableList(itens);
    }

}
