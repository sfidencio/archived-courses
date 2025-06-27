package streams;

public class Produto {
    private String descricao;
    private Double estoque;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public Produto(String descricao, Double estoque) {
        this.descricao = descricao;
        this.estoque = estoque;
    }

    /*@Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", estoque=" + estoque +
                '}';
    }*/
}
