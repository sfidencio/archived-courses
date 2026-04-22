import java.io.Serializable;
import java.math.BigDecimal;


public class Produto implements Serializable {

    //Serve para administrar a versao da classe,
    //Pois se serializarmos um objeto com esta versao,. e necessario que ao deserializar a versao seja mesma..
    //A menos que tenha modificado algum atributo, por isso é estatico
    //Vale lembrar que se nao colocarmos o atributio, pra cada mudanca que ocorrer na classe..tipo add novos fields,
    //JVM ira incrementar internamente o serial da classe..de forma implicita.
    //Ele retornaria um Exception: InvalidClassException
    public static final long serialVersionUID = 2l;

    private Integer codigo;
    private String descricao;
    private BigDecimal preco;
    private BigDecimal estoque;

    public Produto(Integer codigo, String descricao, BigDecimal preco, BigDecimal estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getEstoque() {
        return estoque;
    }

    public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
