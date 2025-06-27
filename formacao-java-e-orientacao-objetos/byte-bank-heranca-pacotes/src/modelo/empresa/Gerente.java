package modelo.empresa;

public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha)
            return true;
        return false;
    }

    @Override
    public double getBonificacao() {
        //A bonificacao do gerente digamos que seja
        //60% do salario do funcionario
        return super.getSalario() * 0.60;
    }
}
