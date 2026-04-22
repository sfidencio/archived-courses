package collections.education;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestandoBuscaViaForEachVsMaps3 {
    public static void main(String[] args) {
        Map<Integer, String> jogadores = new HashMap<>();
        jogadores.put(9, "Neymar Jr");
        jogadores.put(10, "Richarlison");
        jogadores.put(28, "Martinelli");

        //Formas de acesso
        //Pegar chave via Set
        Set<Integer> camisasSet = jogadores.keySet();
        for (Integer integer : camisasSet)
            System.out.println(integer);

        System.out.println();
        System.out.println();

        //Pegar Valor
        Collection<String> nomesCollection = jogadores.values();
        nomesCollection.forEach(item -> {
            System.out.println(item);
        });

        //Cada associacao é reprsentada pela classe Entry
        Set<Map.Entry<Integer, String>> associacoes = jogadores.entrySet();

        /*Repare que o método devolve um
         *Set de Entry
         *(respire fundo!!).
         *Para acessar essa coleção basta usar o foreach:
         */
        System.out.println();
        for (Map.Entry<Integer, String> item : associacoes)
            System.out.println(item.getKey() + " - " + item.getValue());


    }
}
