package com.github.sfidencio.streams;

import java.util.List;

public class Main6 {
    static void main() {
        List<Integer> numeros = List.of(1, 3, 3, 4, 5, 6, 6, 8, 9, 10);
        var uniques = numeros.stream()
                .distinct()
                .toList();
        System.out.println(uniques);
    }
}
