package br.com.github.sfidencio.curso.alura.model;

public class ComponentesDoCalculo {
    private double baseCalculo;
    private double aliquota;

    public ComponentesDoCalculo(double baseCalculo, double aliquota) {
        this.baseCalculo = baseCalculo;
        this.aliquota = aliquota;
    }

    public ComponentesDoCalculo() {
    }

    public double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }
}
