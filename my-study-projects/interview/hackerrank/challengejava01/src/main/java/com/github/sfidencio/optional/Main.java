package com.github.sfidencio.optional;

import java.util.Optional;

public class Main {
    static void main() {
        Optional<Integer> numeroSeguro = Optional.ofNullable(null);
        numeroSeguro.ifPresent(
                n -> System.out.println("O numero é: " + n)
        );

        System.out.println("O numero é: " + numeroSeguro.orElse(10));

        Optional<Integer> numeroSeguroOK = Optional.ofNullable(98);
        numeroSeguroOK.ifPresent(
                n -> System.out.println("O numero é: " + n)
        );
    }
}
