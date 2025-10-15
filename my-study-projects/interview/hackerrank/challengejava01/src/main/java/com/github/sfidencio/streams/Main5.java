package com.github.sfidencio.streams;

import java.util.List;

public class Main5 {
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(soma);
    }
}
