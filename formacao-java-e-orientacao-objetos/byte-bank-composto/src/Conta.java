public class Conta {
    Cliente titular;
    private double saldo;
    int numero;
    int agencia;

    void deposita(double valor) {
        this.saldo += valor; //se eu setasse o valor constante, ai seria HARD CODE.
    }

    boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }

    double getSaldo() {
        return this.saldo;
    }


    boolean transfere(double valor, Conta contaDestino) {
        if (this.saldo <= 0 || valor > this.saldo)
            return false;
        else {
            //contaDestino.saldo += valor;
            contaDestino.deposita(valor);
            //this.saldo -= valor;
            this.saca(valor);
            return true;
        }
    }


    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numero=" + numero +
                ", agencia=" + agencia +
                '}';
    }
}
