package collections.education;

import java.util.HashSet;
import java.util.Set;

public class TestandoSets1 {
    public static void main(String[] args) {
        Set<String> palavras = new HashSet<>();
        palavras.add("Angela");
        palavras.add("Marcio");
        palavras.add("Welton");
        palavras.add("Maria");
        System.out.println("Set nao mantem a ordem de insercao. Utiliza algoritimo de espalhamento para ser mais rapido.");
        System.out.println(palavras);


        for (String palavra : palavras)
            System.out.println(palavra);

        System.out.println("Utilizando foreach lambda expression");
        palavras.forEach(s -> System.out.println(s));

        System.out.println("");

        System.out.println("Observem que os numeros abaixos estao repetidos na codificacao, mas a duplicidade e descartada internamente.");
        //Vantagens, SET nao aceita elementos repetidos, quer ver?
        Set<Number> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(6);
        numeros.add(7);
        numeros.add(7);
        numeros.add(1);

        numeros.forEach(i -> System.out.println(i));

        //Uma das vantagens em utilizar o SET é a performance, por ex: uso no metodo "contains"

        Set<Integer> numerosInteiros = new HashSet<>();
        long tempoInicial = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++) {
            numerosInteiros.add(i);
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + "ms");

        System.out.println();
        tempoInicial = System.currentTimeMillis();
        System.out.println(numerosInteiros.contains(55000));
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + "ms");

        /*
        * Baseado no exemplo,
        * o contains de uma lista faz uma busca linear, ou seja,
        * busca elemento por elemento, para verificar que "Fulano de Tal"
        * não se encontra no meio dos objetos da coleção.
        * Já o HashSet utiliza uma tabela de espalhamento para tentar fazer a busca em tempo constante,
        * tornando a busca mais rápida.
        * */

    }
}
