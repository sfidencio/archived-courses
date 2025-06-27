package br.com.github.sfidencio.model;

public class ContaPoupanca extends  Conta {
    private double creditoJuros;

    public double getCreditoJuros() {
        return creditoJuros;
    }

    public void setCreditoJuros(double creditoJuros) {
        this.creditoJuros = creditoJuros;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "creditoJuros=" + creditoJuros +
                '}';
    }
}
