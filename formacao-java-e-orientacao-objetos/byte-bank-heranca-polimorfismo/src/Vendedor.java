public class Vendedor extends Funcionario {
    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    //Bonificacao do Vendedor é: Bonificacao do funcionario  + comissao
    public double getBonificacao() {
        //System.out.println("Chamando bonificação do : " + this.getClass().getName());
        return (this.getSalario() * 0.1) + this.comissao;
    }
}
