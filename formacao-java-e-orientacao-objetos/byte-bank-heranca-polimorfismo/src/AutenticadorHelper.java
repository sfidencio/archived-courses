public class AutenticadorHelper implements Autenticavel {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha)
            System.out.println("autenticado com sucesso!");
        else {
            System.out.println("falha na autenticação!");
            return false;
        }
        return true;
    }

}
