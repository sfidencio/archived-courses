package com.github.sfidencio.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main9 {
    static void main() {
        List<Integer> numeros = List.of(7, 2, 10, 4, 5, 6, 1, 8, 9, 3);

        var maps = numeros.stream()
                .sorted()
                .map(n -> n * 2)
                .collect(Collectors.toMap(
                        n -> n,
                        n -> "Número: " + n
                ));


        System.out.println(maps);

    }
}
