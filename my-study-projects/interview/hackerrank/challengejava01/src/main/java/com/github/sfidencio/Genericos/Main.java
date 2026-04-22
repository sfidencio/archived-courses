package com.github.sfidencio.Genericos;

public class Main {
    static void main() {
        QualquerCoisa<String> coisa = new QualquerCoisa<>();
        coisa.add("Ola");
        coisa.add("Mundo");

        QualquerCoisa<Integer> numeros = new QualquerCoisa<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(coisa);
        System.out.println(numeros);
    }
}
