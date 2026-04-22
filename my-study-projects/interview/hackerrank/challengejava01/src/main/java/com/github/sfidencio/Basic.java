package com.github.sfidencio;

public class Basic {
    static void main() {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length);
        System.out.println();
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

        String dia = "SEGUNDA";

        switch (dia) {
            case "DOMINGO" -> System.out.println("Hoje é domingo");
            case "SEGUNDA" -> System.out.println("Hoje é segunda");
            case "TERÇA" -> System.out.println("Hoje é terça");
            case "QUARTA" -> System.out.println("Hoje é quarta");
            case "QUINTA" -> System.out.println("Hoje é quinta");
            case "SEXTA" -> System.out.println("Hoje é sexta");
            case "SÁBADO" -> System.out.println("Hoje é sábado");
            default -> System.out.println("Dia inválido");
        }

    }
}
