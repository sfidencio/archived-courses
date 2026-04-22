package com.github.sfidencio.testeshackerrank.calculadoramedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        var calculadoraMedia = new CalculadoraMedia();
        List<Double> notas = new ArrayList<>();
        try {
            while (true) {
                System.out.printf("Entra com a nota de 0-10 ou -1 para sair: ");
                var nota = scanner.nextDouble();
                if (nota == -1) {
                    System.out.println("Encerrando o programa.");
                    break;
                }
//                calculadoraMedia.adicionarNota(nota);
//                var media = calculadoraMedia.calcularMedia();
//                var situacao = calculadoraMedia.determinarSituacao(media);
                notas.add(nota);
            }
            calculadoraMedia.adicionarNota(
                    Arrays.stream(notas.toArray())
                            .mapToDouble(o -> (double) o).toArray()
            );
            calculadoraMedia.exibirRelatorio();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            scanner.nextLine();
        } finally {
            scanner.close();
        }
    }
}
