package com.github.sfidencio.orverloadingandoverride;

/*
* Polimorfismo de Sobrecarga (Overloading)
* em tempo de compilação
* Mesma classe, mesmo nome de método, assinaturas diferentes
* */
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
