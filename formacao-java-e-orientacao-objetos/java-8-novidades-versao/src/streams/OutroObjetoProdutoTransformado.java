package streams;

public class OutroObjetoProdutoTransformado {
    private String nomeProdutoMaiorEstoque;
    private Double estoqueProduto;

    public String getNomeProdutoMaiorEstoque() {
        return nomeProdutoMaiorEstoque;
    }

    public void setNomeProdutoMaiorEstoque(String nomeProdutoMaiorEstoque) {
        this.nomeProdutoMaiorEstoque = nomeProdutoMaiorEstoque;
    }

    public Double getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(Double estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public OutroObjetoProdutoTransformado(String nomeProdutoMaiorEstoque, Double estoqueProduto) {
        this.nomeProdutoMaiorEstoque = nomeProdutoMaiorEstoque;
        this.estoqueProduto = estoqueProduto;
    }

    @Override
    public String toString() {
        return "OutroObjetoProdutoTransformado{" +
                "nomeProdutoMaiorEstoque='" + nomeProdutoMaiorEstoque + '\'' +
                ", estoqueProduto=" + estoqueProduto +
                '}';
    }
}
