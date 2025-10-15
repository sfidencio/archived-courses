package com.github.sfidencio.patternsmatching;

public class Main {
    static void main() {
        Object obj = "Teste";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println("Nao eh uma string");
        }
    }
}
