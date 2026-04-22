package br.com.sfidencio.estoque.estoqueapi.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
//@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private LocalDate dataMovimento;
    @ManyToOne
    @Getter
    @Setter
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movimentacao_id")
    private List<MovimentacaoItemDetalhe> itens = new ArrayList<>();
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private StatusMovimentacao statusMovimentacao;


    public List<MovimentacaoItemDetalhe> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarItem(MovimentacaoItemDetalhe item) {
        this.itens.add(item);
    }

}
