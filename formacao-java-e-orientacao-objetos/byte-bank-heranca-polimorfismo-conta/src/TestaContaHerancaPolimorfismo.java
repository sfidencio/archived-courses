import java.time.Instant;
import java.util.Date;

public class TestaContaHerancaPolimorfismo {
    public static void main(String[] args) {
        //Criando Cliente fulano - C/C
        Cliente clienteFulano = new Cliente("Fulano", "123456789");
        //Criando conta
        //Conta contaFulano = new Conta(clienteFulano,Date.from(Instant.now()),123,121224);
        ContaCorrente contaFulano = new ContaCorrente(clienteFulano, Date.from(Instant.now()), 123, 1212224);

        //Depositando
        contaFulano.deposita(250);
        System.out.println("Saldo: " + contaFulano.getSaldo());
        //Sacando
        contaFulano.saca(20);
        System.out.println("Saldo [Antes Taxa]: " + contaFulano.getSaldo());
        //contaFulano.setTaxaManutencao(0.25);
        System.out.println("Saldo [Depois Taxa]: " + contaFulano.getSaldo());

        System.out.println();
        System.out.println();


        //Criando Cliente beltrano - C/P
        Cliente clienteBeltrano = new Cliente("Beltrano", "789456132");
        ContaPoupanca contaBeltrano = new ContaPoupanca(clienteBeltrano, Date.from(Instant.now()), 123, 1111552552);
        //Depositando
        contaBeltrano.deposita(390);
        System.out.println("Saldo: " + String.format("%.2f", contaBeltrano.getSaldo()));
        //Sacando
        contaFulano.saca(41.98);
        System.out.println("Saldo: " + String.format("%.2f", contaBeltrano.getSaldo()));
        System.out.println("Rendimentos: " + String.format("%.2f", contaBeltrano.getCreditoJuros()));


        //Transferencia
        final var valor = 120.89;
        if (contaFulano.transfere(valor, contaBeltrano))
            System.out.println("Valor: " + valor + " transferido da Conta: " + contaFulano.getTitular().getNome() + " para Conta: " + contaBeltrano.getTitular().getNome());
        else
            System.out.println("Erro ano tentar realizar transferencia!");
        System.out.println();
        System.out.println("Saldo: " + String.format("%.2f", contaFulano.getSaldo()));
        System.out.println("Saldo: " + String.format("%.2f", contaBeltrano.getSaldo()));
    }
}