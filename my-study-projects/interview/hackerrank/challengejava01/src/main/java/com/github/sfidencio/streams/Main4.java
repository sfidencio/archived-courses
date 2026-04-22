package com.github.sfidencio.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    static void main() {
        //Operações intermediárias - Lazy Evaluation

        List<String> nomes = List.of(
                "Ana",
                "Bia",
                "Lia",
                "Gui",
                "Vini",
                "Alberto"
        );


        List<String> nomeEmMaisculos =
                nomes.stream()
                        .map(String::toUpperCase)
                        .toList();

        nomeEmMaisculos.forEach(
                System.out::println
        );

        System.out.println();

        List<List<String>> listasAninhadas = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("A", "B")
        );

        var colecao = listasAninhadas.stream().flatMap(
                List::stream
        ).collect(Collectors.toUnmodifiableList());

        colecao.forEach(System.out::println);


    }
}
