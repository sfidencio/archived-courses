public class PessoaFisicaImpl extends Pessoa {
    private int idade;
    private String cpf;
    public PessoaFisicaImpl() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisicaImpl{" +
                "idade=" + idade +
                ", cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
