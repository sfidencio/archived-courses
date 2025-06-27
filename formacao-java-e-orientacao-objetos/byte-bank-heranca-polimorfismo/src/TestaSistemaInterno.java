import java.util.Arrays;

public class TestaSistemaInterno {
    public static void main(String[] args) {
        //https://pt.wikipedia.org/wiki/Polimorfismo_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)
        System.out.println("Funcionario Gerente.");
        Gerente g1 = new Gerente();
        g1.setNome("Fulano");
        g1.setSalario(2750);
        g1.setSenha(1234);


        //autenticacao
        /*SistemaInterno si = new SistemaInterno();
        si.setSenha(1234);
        si.autentica(g1);*/



        System.out.println(g1.getBonificacao());
        System.out.println();


        /*System.out.println("Funcionario Vendedor.");
        Vendedor v1 = new Vendedor();
        v1.setNome("Beltrano");
        v1.setSalario(2750);
        si.autentica((Autenticavel) v1);*/



    }
}