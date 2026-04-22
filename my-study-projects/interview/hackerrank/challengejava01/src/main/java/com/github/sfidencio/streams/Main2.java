package com.github.sfidencio.streams;

import java.util.Map;

public class Main2 {
    static void main() {
        Map<String, Integer> idades = Map.of(
                "Joao", 20,
                "Maria", 30,
                "Pedro", 40,
                "Ana", 50
        );


        var count = idades.keySet().stream()
                .filter(nome -> nome.length() > 4)
                .count();

        System.out.println(count);
    }
}
