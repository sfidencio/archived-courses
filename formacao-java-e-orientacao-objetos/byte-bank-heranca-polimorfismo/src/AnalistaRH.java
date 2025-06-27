public class AnalistaRH extends Funcionario {

    @Override
    //Bonificacao da Analista de RH é:  0.05% do salario  + R$ 80,00
    public double getBonificacao() {
        //System.out.println("Chamando bonificação do : " + this.getClass().getName());
        return (this.getSalario() * 0.05) + 80;
    }

}
