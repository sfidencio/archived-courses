package collections.education;

import java.util.*;

public class TestandoPerformanceListsVSSets {
    public static void main(String[] args) {


        /*
         * Baseado no exemplo,
         * o contains de uma lista faz uma busca linear, ou seja,
         * busca elemento por elemento, para verificar que "Fulano de Tal"
         * não se encontra no meio dos objetos da coleção.
         * Já o HashSet utiliza uma tabela de espalhamento para tentar fazer a busca em tempo constante,
         * tornando a busca mais rápida.
         * */

        System.out.println("**** Lists vs Sets ***");
        List<Integer> numerosArrayList = new ArrayList<>();
        Set<Integer> numerosHashSet = new HashSet<>();

        int qtdElmentos = 1000000; //1-milhao

        long tempoArrList = insereElementosArrList(qtdElmentos, numerosArrayList);
        long tempoHashSet = insereElementosHashSet(qtdElmentos, numerosHashSet);

        System.out.println("Tempo para insercao no ArrList: " + tempoArrList + "ms");
        System.out.println("Tempo para insercao no Set: " + tempoHashSet + "ms");

        System.out.println();
        System.out.println();

        long tempoPesquisaElementoArrList = verificarSeElementoExisteList(numerosArrayList, 900000);
        long tempoPesquisaElementoSet = verificarSeElementoExisteSet(numerosHashSet, 900000);
        System.out.println("Tempo pesquisa ArrList: " + tempoPesquisaElementoArrList + "ms");
        System.out.println("Tempo pesquisa HashSet: " + tempoPesquisaElementoSet + "ms");


    }

    private static long insereElementosHashSet(int qtdElmentos, Set<Integer> numerosHashSet) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < qtdElmentos; i++)
            numerosHashSet.add(i);
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

    private static long acessarElementoNaPosicaoN(int n, List<Integer> numerosList) {
        long tempoInicial = System.currentTimeMillis();
        Integer elemento = numerosList.get(n);
        //System.out.println("Elemento acessado utilizando: " + numerosList.getClass().getTypeName());
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    private static long verificarSeElementoExisteSet(Collection<Integer> numeros, Integer elementoEncontrado) {
        long tempoInicial = System.currentTimeMillis();
        boolean isExiste = numeros.contains(elementoEncontrado);
        //System.out.println("Encontrado (Set): " + isExiste);
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    private static long verificarSeElementoExisteList(List<Integer> numeros, Integer elementoEncontrado) {
        long tempoInicial = System.currentTimeMillis();
        boolean isExiste = numeros.contains(elementoEncontrado);
        //System.out.println("Encontrado: (List)" + isExiste);
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

}
