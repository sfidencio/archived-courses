package pacote.local;

public class Conta {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo)  throws SaldoInsuficienteRuntimeException {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteRuntimeException {
        if(this.saldo < valor)
            throw  new SaldoInsuficienteRuntimeException("Saldo insuficiente!");
        this.saldo-=valor;
    }

    public void depositar(double valor) throws ValorIncorretoException {
        if(valor <= 0)
            throw  new ValorIncorretoException("Valor menor igual a zero!");

        this.saldo+=valor;
    }
}
