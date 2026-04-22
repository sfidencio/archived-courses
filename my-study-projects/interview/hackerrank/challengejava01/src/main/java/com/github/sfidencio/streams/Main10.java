package com.github.sfidencio.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main10 {
    static void main() {
        List<Integer> numeros = List.of(
                7,
                2,
                10,
                4,
                5,
                6,
                1,
                8,
                9,
                3
        );

        //estrategia 1: agrupar por par e impar
       var separandoParesImpares = numeros.stream()
                       .collect(
                               Collectors.partitioningBy(
                                        n -> n % 2 == 0
                               )
                       );

        System.out.println(separandoParesImpares);

        //estrategia 2: agrupar por valor maior ou menor que 5
        var separandoNumerosMaioresCinco = numeros.stream()
                .collect(
                        Collectors.partitioningBy(
                                n -> n > 5
                        )
                );

        System.out.println(separandoNumerosMaioresCinco);

    }
}
