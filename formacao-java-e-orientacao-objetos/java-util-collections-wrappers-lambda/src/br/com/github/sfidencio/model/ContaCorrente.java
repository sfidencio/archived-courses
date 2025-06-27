package br.com.github.sfidencio.model;

public class ContaCorrente extends  Conta {
    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "taxa=" + taxa +
                '}';
    }
}
