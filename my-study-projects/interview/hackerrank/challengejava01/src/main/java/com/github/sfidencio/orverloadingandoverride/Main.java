package com.github.sfidencio.orverloadingandoverride;

public class Main {
    static void main() {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(1,2));
        System.out.println(calc.somar(1.5,2.5));
        System.out.println(calc.somar(1,2,3));

    }
}
