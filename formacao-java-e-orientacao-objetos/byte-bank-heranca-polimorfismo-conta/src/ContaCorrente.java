import java.util.Date;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente titular, Date dataAbertura, int agencia, int conta) {
        super(titular, dataAbertura, agencia, conta);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public boolean saca(double valor) {
        System.out.println("Valor original do saque: " + String.format("%.2f", valor));
        Tributavel iof = new IOF();
        double valorLiquido = valor + 0.20; //0,20 centavos por saque
        valorLiquido += iof.getValorImposto(valorLiquido);
        return super.saca(valorLiquido);
    }

}
