package com.github.sfidencio.recordpatterns;

public class Main {
    static void main() {
        Pessoa p = new Pessoa("Sebastiao",39);
        assert p.idade > 39: "Idade menor que 40";



    }

    record Pessoa(String nome, int idade){}
}
