import java.util.Date;
import java.util.Random;

public class ContaPoupanca extends Conta {

    private double creditoJuros = new Random().nextDouble();

    public ContaPoupanca(Cliente titular, Date dataAbertura, int agencia, int conta) {
        super(titular, dataAbertura, agencia, conta);
    }

    public double getCreditoJuros() {
        return creditoJuros;
    }

    public void setCreditoJuros(double creditoJuros) {
        this.creditoJuros = creditoJuros;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo() + this.creditoJuros;
    }
}
