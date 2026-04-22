package com.github.sfidencio;

import java.util.*;

public class TestandoColecoes {
    static void main() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Fulano");
        nomes.add("Ciclano");
        nomes.add("Beltrano");
        nomes.add("Fulano");
        System.out.println(nomes);

        Set<String> nomesSet = new HashSet<>();
        nomesSet.add("Fulano");
        nomesSet.add("Ciclano");
        nomesSet.add("Beltrano");
        nomesSet.add("Fulano");
        System.out.println(nomesSet);

        System.out.println();

        Map<String, Integer> nomesIdade = new HashMap<>();
        nomesIdade.put("Fulano", 30);
        nomesIdade.put("Ciclano", 25);
        nomesIdade.put("Beltrano", 28);
        System.out.println(nomesIdade);

        nomesIdade.put("Fulano", 31); // Atualiza a idade de Fulano
        System.out.println(nomesIdade);



    }
}
