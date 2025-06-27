package br.com.github.sfidencio.model;

import java.util.ArrayList;
import java.util.List;

public class DominandoArrayLists {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>(0);
        frutas.add("Maca");
        frutas.add("Pera");
        frutas.add("Banana");
        System.out.println(String.format("Total de frutas: %d",frutas.size()));
        Object banana = frutas.get(2);
        System.out.println("Fruta: " + banana.toString());
        System.out.println("Elemento removido: " +  frutas.remove(0));

        System.out.println(String.format("Total de frutas: %d",frutas.size()));
    }
}
