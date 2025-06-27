package defaultmethod.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarInteirosComComparing {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(7);
        numeros.add(6);
        numeros.add(5);

        System.out.println("Usando metodo estatico da classe Comparator");
        System.out.println("Antes de ordenar");
        //numeros.forEach(item-> System.out.println(item));
        System.out.println(numeros);
        System.out.println("Depois de ordenar - Natural");
        System.out.println("Depois de ordenar - Natural");
        numeros.sort(Comparator.naturalOrder());
        System.out.println(numeros);
        System.out.println("Depois de ordenar - Reverse");
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);

    }
}
