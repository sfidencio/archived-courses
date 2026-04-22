package br.com.github.sfidencio.curso.alura.model2;

import br.com.github.sfidencio.curso.alura.model.Produto;
import br.com.github.sfidencio.curso.alura.model.Status;

public class ProdutoPerigoso extends Produto {
    public ProdutoPerigoso(Long id, String descricao) {
        super(id, descricao);
        super.status = Status.ATIVO;
    }

    public ProdutoPerigoso() {
    }
}
