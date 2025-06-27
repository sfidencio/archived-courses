public class FuncionarioSemOOCodigoMalCheiro {
    private String nome;
    private String cpf;
    private double salario;
    private int tipoFuncionario = 0; //0-comum 1-gerente 2-diretor


    public FuncionarioSemOOCodigoMalCheiro(String nome, String cpf, double salario, int tipoFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tipoFuncionario = tipoFuncionario;
    }
    /*Obs: Esses problemas no código ou design também são chamados de
    *Code Smells (mau cheiro no código).
    *Existe um livro famoso Clean Code, do autor Robert C Martin,
    *que ficou famoso pois mostra os Code Smells e como resolvê-los.
    *O livro já é um pouco antigo, mas vale a leitura.
    *
    * Observe a qtde de If's..esse codigo nunca para de crescer se precisarmos adicionar novos tipos de funcionario e novas
    * regras para gerar bonficação
    */
    public double getBonificacao() {
        double bonificacao = 0d;
        if (this.tipoFuncionario == 0)
            bonificacao = this.salario * 0.10;
        else if (this.tipoFuncionario == 1)
            bonificacao = this.salario * 0.20;
        else if (this.tipoFuncionario == 2)
            bonificacao = this.salario * 0.30;
        return bonificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    @Override
    public String toString() {
        String retorno = "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario + '\'' +
                ", bonificao=" + this.getBonificacao() +
                '}';
        System.out.println(retorno);
        return retorno;
    }
}
