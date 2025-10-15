package com.github.sfidencio.polimorfismoemtempoexecucao;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }
}
