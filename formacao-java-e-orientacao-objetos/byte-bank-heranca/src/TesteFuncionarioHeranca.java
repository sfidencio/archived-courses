public class TesteFuncionarioHeranca {
    public static void main(String[] args) {
        System.out.println("Criando Funcionario Comum!");
        Funcionario f1 = new Funcionario();
        f1.setNome("Beltrano de Tal");
        f1.setCpf("555555555");
        f1.setSalario(4200);

        System.out.println();
        System.out.println("Usuario: " + f1.getNome() + " - Tipo: " + f1.getClass().getCanonicalName());
        System.out.println("Bonificacao: " + f1.getBonificacao() );

        System.out.println("Criando Gerente!");
        Gerente g1 = new Gerente();
        g1.setNome("Fulano de Tal");
        g1.setCpf("123456789");
        g1.setSalario(4200);
        g1.setSenha(2222);

        if (g1.autentica(2222))
            System.out.println("Autenticado!");
        else
            System.out.println("Credenciais invalidas!");

        System.out.println();
        System.out.println("Usuario: " + g1.getNome() + " - Tipo: " + g1.getClass().getCanonicalName());
        System.out.println("Bonificacao: " + g1.getBonificacao());
    }
}
