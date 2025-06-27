import br.com.github.sfidencio.model.ContaCorrente;
import br.com.github.sfidencio.model.ContaPoupanca;

public class EstudoArraysReferenciasObjects {
    public static void main(String[] args) {
        Object[] contas = new Object[2];
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setCpf("88888888888");
        cc1.setTitular("Fulano de Tal");
        cc1.setTaxa(2.6);
        cc1.depositar(250.22);
        contas[0] = cc1;

        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setCpf("88888888888");
        cp1.setTitular("Fulano de Tal");
        cp1.setCreditoJuros(0.06);
        cp1.depositar(150);
        contas[1] = cp1;


        System.out.println("Conta: " + ((ContaCorrente) contas[0]));
        System.out.println("Conta: " + ((ContaPoupanca) contas[1]));


    }
}
