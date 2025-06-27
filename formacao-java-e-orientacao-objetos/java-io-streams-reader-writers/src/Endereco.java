import java.io.Serializable;

public class Endereco implements Serializable {
    private String rua;
    private String cep;

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
