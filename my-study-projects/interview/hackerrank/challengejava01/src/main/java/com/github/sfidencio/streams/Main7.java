package com.github.sfidencio.streams;

import java.util.List;

public class Main7 {
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var uniques = numeros.stream()
                .skip(3)
                .limit(3)
                .toList();
        System.out.println(uniques);
    }
}
