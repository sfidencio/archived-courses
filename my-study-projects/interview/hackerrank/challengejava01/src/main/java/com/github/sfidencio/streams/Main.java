package com.github.sfidencio.streams;

import java.util.List;

public class Main {
    static void main() {
        List<Double> valores = List.of(10.0, 20.0, 30.0, 40.0, 50.0);


        Double valoresSomados = valores.stream()
                .mapToDouble(
                        v -> v * 0.9
                )
                .sum();

        System.out.println(valoresSomados);


    }
}
