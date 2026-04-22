package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PraticandoLambdas2 {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>();
        precos.add(2.20);
        precos.add(2.40);
        precos.add(10.50);
        precos.add(10.70);
        precos.add(0.89);

        System.out.println(precos);

        //Ordenando pela implementacao interna de Double. Visto que implementa Comparable
        //Poderia utilizar Collections.sort(....);
        Collections.sort(precos, (n1, n2) -> Double.compare(n1, n2));
        System.out.println(precos);
        Collections.sort(precos, (n1, n2) -> Double.compare(n2, n1));
        System.out.println(precos);

        //MethodReferences
        Collections.sort(precos, Comparator.comparing(n -> n));
        System.out.println(precos);
        Collections.sort(precos, Comparator.naturalOrder());
        System.out.println(precos);
        Collections.sort(precos, Comparator.reverseOrder());
        System.out.println(precos);


        System.out.println(isInvalidCpfECanal("10000000000", "100"));


    }

    private static Boolean isInvalidCpfECanal(String cpf, String canal) {
        return (cpf.trim().equals("00000000000") && canal.trim().equals("000")) || (cpf.trim().equals("00000000000") || canal.trim().equals("000"));
    }

}
