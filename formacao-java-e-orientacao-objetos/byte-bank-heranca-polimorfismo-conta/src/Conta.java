import java.util.Date;

//Nao instancia mais
public abstract class Conta {
    private Cliente titular;
    private Date dataAbertura;
    private int agencia;
    private int conta;
    private double saldo;

    public boolean deposita(double valor) {
        if (valor <= 0)
            return false;
        System.out.println("Depositando: " + String.format("%.2f", valor) + " na " + this.getClass().getName());
        this.saldo += valor;
        return true;
    }

    public boolean saca(double valor) {
        if (valor <= this.saldo) {
            System.out.println("Sacando: " + String.format("%.2f", valor) + " na " + this.getClass().getName());
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (valor <= 0 || valor > this.saldo)
            return false;
        if (destino.deposita(valor))
            if (this.saca(valor))
                System.out.println("Transferindo: " + String.format("%.2f", valor) + " na " + this.getClass().getName());
        return true;
    }

    public Conta(Cliente titular, Date dataAbertura, int agencia, int conta) {
        this.titular = titular;
        this.dataAbertura = dataAbertura;
        this.agencia = agencia;
        this.conta = conta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        System.out.println("Pegando saldo da classe: " + this.getClass().getName());
        return this.saldo;
    }
}
