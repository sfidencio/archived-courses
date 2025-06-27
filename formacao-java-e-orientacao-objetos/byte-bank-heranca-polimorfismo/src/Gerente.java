//Relação de Herança é do tipo "é um"
//Composição é do tipo "tem um"
public class Gerente extends Funcionario {

    private Autenticavel autenticador = new AutenticadorHelper(); //Composição é melhor que herança, que acopla menos.


    public Gerente() {
        if (autenticador == null)
            this.autenticador = new AutenticadorHelper();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    //Bonificacao do Gerente é:  bonificação do funcionário comum + R$ 250,00
    public double getBonificacao() {
        //System.out.println("Chamando bonificação do : " + this.getClass().getName());
        return (this.getSalario() * 0.1) + 250;
    }
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
