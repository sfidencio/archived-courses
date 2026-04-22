package collections.education;

import java.util.*;

public class TestandoSets2 {
    public static void main(String[] args) {
        //Transformando um Set em um List
        Set<Integer> numerosSet = new HashSet<>();
        numerosSet.add(1);
        numerosSet.add(2);
        numerosSet.add(3);
        numerosSet.add(4);
        numerosSet.add(5);
        numerosSet.add(6);
        numerosSet.add(6);
        numerosSet.add(7);
        numerosSet.add(7);
        numerosSet.add(1);
        numerosSet.add(11);
        numerosSet.add(18);
        numerosSet.add(-90);
        numerosSet.add(-5);
        System.out.println();
        //Eliminado registros repetidos
        System.out.println(numerosSet + " \nSize: " + numerosSet.size());

        //Como Set é um conjunto de elementos contidos em uma sacola grande, sem ordem...vamos colocar ordem
        List<Integer> numerosList = new ArrayList<>(numerosSet);
        System.out.println("Observe que serao mostrados conforme a ordem de insercao vinda do Set, lembrando que o SET é aleatoria, a cada execucao ou insercao ele muda  ordem., pois e aleatorio.");
        System.out.println(numerosList);
        System.out.println("Ordenando...");
        Collections.sort(numerosList);
        System.out.println("A-Z==> " + numerosList);
        Collections.reverse(numerosList);
        System.out.println("Z-A==> " + numerosList);



    }
}
