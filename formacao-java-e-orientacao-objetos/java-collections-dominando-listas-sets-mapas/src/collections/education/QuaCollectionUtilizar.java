package collections.education;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuaCollectionUtilizar {
    public static void main(String[] args) {
        System.out.println("Obtendo frequencia de elementos. (Hashset) remove duplicados,. cuidado!!!");
        Collection<String> frutas = new ArrayList<>();
        frutas.add("Morango");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Salada");
        frutas.add("Morango");
        frutas.add("Morango");
        frutas.add("Morango");
        frutas.add("Morango");
        frutas.add("Uva");

        frutas.forEach(item -> {
            System.out.println(item);
        });

        int frequencia = Collections.frequency(frutas, "Morango");
        System.out.println("Frequencia morangos: " +frequencia);

        System.out.println();
        int frequencia1 = Collections.frequency(frutas, "Uva");
        System.out.println("Frequencia Uvas: " + frequencia1);
    }
}
