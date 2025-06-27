package collections.education;

public class Produto {
    private String descricao;
    private double preco;
    private double estoque;

    public Produto(String descricao, double preco, double estoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "curso.Produto{" + "\n" +
                "descricao='" + descricao + '\'' + "\n" +
                "preco=" + preco + "\n" +
                "estoque=" + estoque + "\n" +
                '}';
    }
}
