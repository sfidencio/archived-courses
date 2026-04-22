package com.github.sfidencio.testeshackerrank.calculadoramedia;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraMedia {
    private List<Double> notas;

    public CalculadoraMedia() {
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        this.validarNota(nota);
        this.notas.add(nota);
    }

    public void adicionarNota(double... notas) {
        for (int i = 0; i < notas.length; i++) {
            this.adicionarNota(notas[i]);
        }
    }

    private void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida: " + nota);
        }
    }

    public double calcularMedia() {
        if (this.notas.isEmpty()) {
            throw new IllegalStateException("Nenhuma nota adicionada");
        }
        int quantidadeNotas = this.notas.size();

        return this.notas.stream()
                .mapToDouble(Double::doubleValue)
                .sum() / quantidadeNotas;
    }

    public Situacao determinarSituacao(double media) {
        if (media >= 7) {
            return Situacao.APROVADO;
        } else if (media >= 5) {
            return Situacao.RECUPERACAO;
        } else {
            return Situacao.REPROVADO;
        }
    }

    public void exibirRelatorio() {
        var media = this.calcularMedia();
        var situacao = this.determinarSituacao(media);
        System.out.println("Notas: " + this.notas);
        System.out.printf("Média: %.2f - Situação: %s%n", media, situacao);
    }
}
