package com.github.sfidencio.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main8 {
    static void main() {
        List<Integer> numeros = List.of(7, 2, 10, 4, 5, 6, 1, 8, 9, 3);
        var asc = numeros.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println(asc);

        var desc = numeros.stream()
                .sorted((a, b) -> b - a)
                //.peek(System.out::println)
                .distinct()
                .toList();
        System.out.println(desc);

        System.out.println();


        var descSet = numeros.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .skip(2)
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println(descSet);




    }
}
