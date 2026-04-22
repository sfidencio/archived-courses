package novidades.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testes3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(10);
        numeros.add(8);
        numeros.add(4);
        numeros.add(9);
        numeros.add(18);
        numeros.add(25);
        numeros.add(35);
        numeros.add(2);
        numeros.add(2);


        var teste = numeros.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(teste);


        //public static List<String> URLS_TESTE = List.of("http://localhost","http://kubernetes.docker.internal");

    }
}
