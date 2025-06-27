//Assinou o contrato com a interface autenticavel
//tem por obrigação implementar os metodos(obrigacoes contratuais)
public class Cliente implements Autenticavel {
    private String nome;
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Cliente(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha)
            System.out.println(this.nome + "=> logado com sucesso!");
        else {
            System.out.println(this.nome + "=> falha na autenticação!");
            return false;
        }
        return true;
    }
}
