package br.com.sfidencio.curso.teste.automatizados;

public class Calculadora {
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public double multiplicar(int i, int i1) {
        return i * i1;
    }

    public double multiplicar(Double... numeros) {
        double produto = numeros[0];
        for (int i = 1; i < numeros.length; i++)
            produto *= numeros[i];
        return produto;
    }
}
