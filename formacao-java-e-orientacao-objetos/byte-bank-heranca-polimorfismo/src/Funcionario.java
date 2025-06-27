//Como a classe funcionario servira apenas de modelo para as classes filhas,
//Nao teremos objetos concretos do tipo Funcionario..apenas referencia.
//Logo vamos promover a classe funcionario para abstrata
public abstract class Funcionario {
    private String nome;
    private double salario;

    //10% de bonificacao para qualquer funcionario
    /*public double getBonificacao() {
        System.out.println("Chamando bonificação do : " + this.getClass().getName());
        return this.salario * 0.1;
    }*/


    //Aqui a classe mae esta dizendo que nao sabe implementar a bonificacao
    //Vai ficar a cargo de quem herdar esta classe.
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
