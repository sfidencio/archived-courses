package com.github.sfidencio;

import java.util.List;

public class Lambda {
    static void main() {
        List<String> nomes = List.of(
                "Ana",
                "Bia",
                "Lia",
                "Gui",
                "Vini",
                "Alberto"
        );
        nomes.stream()
                .filter(p -> p.startsWith("A"))
                .parallel()
                .limit(100)
                .forEach(
                        p -> System.out.println(p)
                );



    }
}
