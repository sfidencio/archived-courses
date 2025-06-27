public class Conta {
    private Cliente titular;
    private double saldo;
    private int numero;
    private int agencia;

    private static int total; //atributo da Classe e nao da instancia, este e compartilhado entre todas instancias.


    public Conta(Cliente titular, int numero, int agencia) {
        Conta.total++;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void deposita(double valor) {
        this.saldo += valor; //se eu setasse o valor constante, ai seria HARD CODE.
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else
            return false;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public boolean transfere(double valor, Conta contaDestino) {
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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Numero da conta tem que ser maior que zero!");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Agência da conta tem que ser maior que zero!");
            return;
        }
        this.agencia = agencia;

    }

    @Override
    public String toString() {
        return "Conta {" +
                "titular='" + this.titular.getNome() + " - " + this.titular.getCpf() + '\'' +
                ", saldo=" + this.saldo +
                ", numero=" + this.numero +
                ", agencia=" + this.agencia +
                '}';
    }

    public static int getTotal() {
        return Conta.total;
    }
}
