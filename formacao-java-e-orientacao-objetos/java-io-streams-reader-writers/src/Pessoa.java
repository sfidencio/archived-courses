import java.io.Serializable;

public class Pessoa  implements Serializable {
    private String nome;

    //Caso nao queira serializar este obj basta colocar palavra chave 'transient'
    //private transient Endereco endereco;  //pode utizar @Annotation @Transient nas versoes mais novas do java
    private Endereco endereco;
    private double limiteCredito;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", limiteCredito=" + limiteCredito +
                '}';
    }
}
