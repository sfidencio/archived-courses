package collections.education;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestandoListas8 {
    public static void main(String[] args) {
      List<Integer> numerosSorteio =  new ArrayList<>();
        for (int i = 1; i <= 100 ; i++) {
            numerosSorteio.add(i);
        }

        System.out.println(numerosSorteio);
        System.out.println();

        //Embaralhando lista para sortei
        Collections.shuffle(numerosSorteio);
        System.out.println(numerosSorteio);

        //Inicializando listas com valores nulos especificos
        int i = 0;
        List<Integer> numeros = new ArrayList<>(Collections.nCopies(1000,null));
        numeros.forEach(item -> {
            System.out.println(item);
        });

    }
}
