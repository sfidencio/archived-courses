package com.github.sfidencio;

import java.util.Arrays;

import static java.lang.Math.PI;

public class VarArgs {
    static void main() {
        System.out.println(calcularNumeros(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(calcularNumerosOld(19, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(PI);

        //PI serve para calcular a area do circulo
        double raio = 3;
        double area = PI * Math.pow(raio, 2);
        System.out.println(area);

    }

    static int calcularNumeros(int... numeros) {
        return Arrays.stream(numeros)
                .sum();
    }

    static int calcularNumerosOld(int... numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }
}
