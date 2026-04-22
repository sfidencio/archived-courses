package br.com.github.sfidencio.curso.alura.model;

public class ProdutoEspecial extends Produto {
    private String ncm;

    public ProdutoEspecial(Long id, String descricao) {
        super(id, descricao);
        super.status = Status.CANCELADO;
    }

    public ProdutoEspecial() {
    }
}
