package com.github.sfidencio;

public class SwitchExpression {
    static void main() {
        //switch java 1.2 - java 5
        int numero = 2;
        String dia;
        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            default:
                dia = "Outro dia";
                break;
        }
        System.out.println(dia);

        //switch java 12 - java 19
        int numero2 = 5;
        String dia2 = switch (numero2) {
            case 1, 2, 3 -> "Domingo";
            case 4 -> "Segunda";
            case 5 -> {
                System.out.println("Hoje é terça");
                yield "Terça";
            }
            default -> "Outro dia";
        };
        System.out.println(dia2);
    }


}
