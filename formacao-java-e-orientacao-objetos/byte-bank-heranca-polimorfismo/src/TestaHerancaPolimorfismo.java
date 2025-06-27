import java.util.Arrays;

public class TestaHerancaPolimorfismo {
    public static void main(String[] args) {
        //https://pt.wikipedia.org/wiki/Polimorfismo_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)
        System.out.println("Funcionario Gerente.");
        Gerente g1 = new Gerente();
        g1.setNome("Fulano");
        g1.setSalario(2750);

        //autenticacao
        g1.setSenha(1234);
        g1.autentica(1234);


        System.out.println(g1.getBonificacao());
        System.out.println();

        /*System.out.println("Funcionario Comum.");
        Funcionario f1 = new Funcionario();
        f1.setNome("Beltrano");
        f1.setSalario(1200);
        System.out.println(f1.getBonificacao());*/

        System.out.println("Funcionario Vendedor.");
        Vendedor v1 = new Vendedor();
        v1.setNome("Beltrano");
        v1.setComissao(87);
        v1.setSalario(800);
        System.out.println(v1.getBonificacao());

        System.out.println();
        System.out.println("Funcionario Analista de RH.");
        AnalistaRH a1 = new AnalistaRH();
        a1.setNome("Ciclano");
        a1.setSalario(950);
        System.out.println(a1.getBonificacao());
        System.out.println();

        System.out.println();
        System.out.println("Registro total bonificações!");
        AdministraBonificacao administraBonificacao = new AdministraBonificacao();

        //Posso adicionar um por um..
        /*administraBonificacao.registra(g1);
        administraBonificacao.registra(f1);
        administraBonificacao.registra(v1);*/

        //Ou então, adicionar a coleção..transformando uma sequencia passada via operador Spread.. em uma lista.
        administraBonificacao.registra(Arrays.asList(g1, v1, a1));

        //Vamos agora somar as bonificações
        System.out.println("Total das bonificações: " + administraBonificacao.getTotalBonificacoes());

        //Como provo que o polimorfismo foi aplicado?
        //E que a JVM..soube exatamente qual método invocar, com base na

        /*Funcionario f = new Gerente();
        ((Gerente)f).setSenha(1234);*/
    }
}