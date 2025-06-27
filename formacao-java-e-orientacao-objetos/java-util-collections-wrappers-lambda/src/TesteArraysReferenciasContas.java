import br.com.github.sfidencio.model.Conta;

public class TesteArraysReferenciasContas {
    public static void main(String[] args) {
        Conta[] contas = new Conta[2]; //inicializa com 2 elementos.
        Conta conta1 = new Conta();
        conta1.setNumeroConta(123);
        conta1.setTitular("Fulano");
        conta1.setCpf("8888888888");
        conta1.depositar(200.00);
        Conta conta2 = new Conta();
        conta2.setNumeroConta(321);
        conta2.setTitular("Beltrano");
        conta2.setCpf("999999999");
        conta2.depositar(200);
        conta2.sacar(67);
        contas[0] = conta1;
        contas[1] = conta2;
        for (int i = 0; i < contas.length; i++)
            System.out.println(contas[i].getTitular() + " - " + contas[i].getSaldo());


        //Criando uma ref para a primeira posicao do Array fixo.
        Conta cc1 = contas[0];
        cc1.depositar(25.27);
        System.out.println();

        //Imprimir saldo novamente.
        for (int i = 0; i < contas.length; i++)
            System.out.println(contas[i].getTitular() + " - " + contas[i].getSaldo());

        //Criando uma ref para a primeira posicao do Array fixo.
        Conta cc2 = contas[0];
        cc1.sacar(11.37);
        System.out.println();
        //Imprimir saldo novamente.
        for (int i = 0; i < contas.length; i++)
            System.out.println(contas[i].getTitular() + " - " + contas[i].getSaldo());



    }
}
