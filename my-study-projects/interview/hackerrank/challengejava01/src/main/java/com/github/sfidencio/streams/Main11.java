package com.github.sfidencio.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main11 {
    static void main() {
        List<String> nomes = List.of(
                "Ana",
                "Bia",
                "Lia",
                "Gui",
                "Vini",
                "Alberto"
        );

        var nomesJuntados = nomes.stream()
                .collect(Collectors.joining(","));

        

        System.out.println(nomesJuntados);

    }
}
