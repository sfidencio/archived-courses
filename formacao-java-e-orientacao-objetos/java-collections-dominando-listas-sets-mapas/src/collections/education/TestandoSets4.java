package collections.education;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestandoSets4 {
    public static void main(String[] args) throws IOException {
        Collection<Integer> numeros = null;

        numeros = new HashSet<>();
        System.out.println("Sets nao aceitam valores repetidos!");
        System.out.println("Adicionou? 1 =>" + (numeros.add(1) ? "Sim" : "Não"));
        System.out.println("Adicionou? 1 =>" + (numeros.add(1) ? "Sim" : "Não"));
        System.out.println("Adicionou? 2 =>" + (numeros.add(2) ? "Sim" : "Não"));
        System.out.println("Adicionou? 3 =>" + (numeros.add(3) ? "Sim" : "Não"));
        System.out.println("Adicionou? 4 =>" + (numeros.add(4) ? "Sim" : "Não"));
        System.out.println("Adicionou? 5 =>" + (numeros.add(5) ? "Sim" : "Não"));
        System.out.println("Adicionou? 6 =>" + (numeros.add(6) ? "Sim" : "Não"));
        System.out.println("Adicionou? 6 =>" + (numeros.add(6) ? "Sim" : "Não"));
        System.out.println("Tamanho do Set: " + numeros.size());


        System.out.println();
        numeros = new ArrayList<>(0);
        System.out.println("Lists aceitam valores repetidos!");
        System.out.println("Adicionou? 1 =>" + (numeros.add(1) ? "Sim" : "Não"));
        System.out.println("Adicionou? 1 =>" + (numeros.add(1) ? "Sim" : "Não"));
        System.out.println("Adicionou? 2 =>" + (numeros.add(2) ? "Sim" : "Não"));
        System.out.println("Adicionou? 3 =>" + (numeros.add(3) ? "Sim" : "Não"));
        System.out.println("Adicionou? 4 =>" + (numeros.add(4) ? "Sim" : "Não"));
        System.out.println("Adicionou? 5 =>" + (numeros.add(5) ? "Sim" : "Não"));
        System.out.println("Adicionou? 6 =>" + (numeros.add(6) ? "Sim" : "Não"));
        System.out.println("Adicionou? 6 =>" + (numeros.add(6) ? "Sim" : "Não"));
        System.out.println("Tamanho da List: " + numeros.size());

    }

}
