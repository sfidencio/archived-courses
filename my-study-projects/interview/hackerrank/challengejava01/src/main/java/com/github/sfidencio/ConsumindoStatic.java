package com.github.sfidencio;

public class ConsumindoStatic {
    static void main(String[] args) {
        System.out.println("Idade fixa: " + UsoDoStatic.IDADE_FIXA);
        System.out.println("Idade fixa via metodo: " + UsoDoStatic.getIdadeFixa());
        System.out.println();
        System.out.println("Contador: " + UsoDoStatic.incrementarContator());
    }
}
