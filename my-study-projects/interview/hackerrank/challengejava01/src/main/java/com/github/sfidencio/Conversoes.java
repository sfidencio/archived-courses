package com.github.sfidencio;

import java.util.Scanner;

public class Conversoes {
    static void main() {
        Integer idade = 30; // Autoboxing
        int idadePrimitiva = idade; // Unboxing

        //nem sempre é possivel fazer unboxing
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = input.nextInt(); // Autoboxing

        Object obj = Integer.valueOf(idade);
        if (obj instanceof Integer) {
            int valor = (Integer) obj; // Unboxing seguro
            System.out.println("Valor: " + valor);
        } else {
            System.out.println("O objeto não é um Integer.");
        }
    }
}
