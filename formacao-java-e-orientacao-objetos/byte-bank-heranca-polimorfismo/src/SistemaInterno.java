public class SistemaInterno {
    private int senha = 2222;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou)
            System.out.println("Autenticado com sucesso!");
        else
            System.out.println("Não pode entrar no sistema!");
    }
}
