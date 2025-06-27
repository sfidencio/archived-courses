package collections.education;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestandoPerformanceLinkedListArrayList {
    public static void main(String[] args) {

        System.out.println("**** ArrayList vs LinkedList ***");
        List<Integer> numerosArrayList = new ArrayList<>();
        List<Integer> numerosLinkedList = new LinkedList<>();

        int qtdElmentos = 1000000; //1-milhao

        long tempoArrList = insereElementosArrList(qtdElmentos, numerosArrayList);
        long tempoLinkedList = insereElementosLinkedList(qtdElmentos, numerosLinkedList);

        System.out.println("Tempo para insercao no ArrList: " + tempoArrList + "ms");
        System.out.println("Tempo para insercao no LinkedList: " + tempoLinkedList + "ms");

        System.out.println();
        System.out.println();
        long tempoRemocaoLinkedList = removerPrimeiroElementoList(numerosLinkedList);
        long tempoRemocaoArrList = removerPrimeiroElementoList(numerosArrayList);
        System.out.println("Tempo remoção ArrList: " + tempoRemocaoArrList + "ms");
        System.out.println("Tempo remoção LinkedList: " + tempoRemocaoLinkedList + "ms");

        System.out.println();
        System.out.println();

        long tempoAcessoUmElementoLinkedList = acessarElementoNaPosicaoN(600000,numerosLinkedList);
        long tempoAcessoUmElementoArrList = acessarElementoNaPosicaoN(950000,numerosArrayList);
        System.out.println("Tempo acesso ArrList: " + tempoAcessoUmElementoArrList + "ms");
        System.out.println("Tempo acesso LinkedList: " + tempoAcessoUmElementoLinkedList + "ms");


    }

    private static long insereElementosLinkedList(int qtdElmentos, List<Integer> numerosLinkedList) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < qtdElmentos; i++)
            numerosLinkedList.add(i);
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    private static long insereElementosArrList(int qtdElmentos, List<Integer> numerosArrayList) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < qtdElmentos; i++)
            numerosArrayList.add(i);
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    private static long removerPrimeiroElementoList(List<Integer> numerosList) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            numerosList.remove(0);
        }
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    private static long acessarElementoNaPosicaoN(int n,List<Integer> numerosList ) {
        long tempoInicial = System.currentTimeMillis();
        Integer elemento = numerosList.get(n);
        //System.out.println("Elemento acessado utilizando: " + numerosList.getClass().getTypeName());
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

}
