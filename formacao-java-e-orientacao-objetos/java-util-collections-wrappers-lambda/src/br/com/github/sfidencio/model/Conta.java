package br.com.github.sfidencio.model;

public class Conta {
    private int numeroConta;
    private String titular;
    private String cpf;

    private double saldo;

    public Conta(int numeroConta, String titular, String cpf) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.cpf = cpf;
    }

    public Conta() {
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor)
            throw new IllegalArgumentException("Saldo insuficiente!");
        this.saldo -= valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
