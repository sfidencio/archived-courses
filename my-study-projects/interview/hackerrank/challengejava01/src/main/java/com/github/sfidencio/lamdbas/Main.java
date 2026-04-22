package com.github.sfidencio.lamdbas;

import java.util.Arrays;

public class Main {
    static void main() {
        Soma soma = (int... args) -> {
            return Arrays.stream(args)
                    .sum();
        };

        System.out.println(soma.somar(1,2,3,4,5) );
        System.out.println(soma.somar(5,2,1,4,5) );

    }
}
