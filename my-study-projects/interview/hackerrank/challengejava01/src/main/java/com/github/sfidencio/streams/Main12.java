package com.github.sfidencio.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main12 {
    static void main() {
        List<String> nomes = List.of(
                "Ana",
                "Bia",
                "Lia",
                "Gui",
                "Vini",
                "Alberto"
        );

        var nomesAgrupadosTamanho = nomes.stream()
                        .collect(Collectors.groupingBy(
                                String::length
                        ));

        System.out.println(nomesAgrupadosTamanho);


    }
}
