package br.com.github.sfidencio.curso.alura.model;

public class Pis implements Tributavel {
    @Override
    public double calcular(ComponentesDoCalculo componentesDoCalculo) {
        return componentesDoCalculo.getBaseCalculo() * componentesDoCalculo.getAliquota();
    }
    @Override
    public double calcular() {
        return 10*30;
    }
}
