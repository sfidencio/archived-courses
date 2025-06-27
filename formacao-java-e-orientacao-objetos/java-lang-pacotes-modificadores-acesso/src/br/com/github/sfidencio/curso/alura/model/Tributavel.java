package br.com.github.sfidencio.curso.alura.model;

public interface Tributavel {
    double calcular(ComponentesDoCalculo componentesDoCalculo);

    double calcular() throws ErroCalcularImpostoException;
}
