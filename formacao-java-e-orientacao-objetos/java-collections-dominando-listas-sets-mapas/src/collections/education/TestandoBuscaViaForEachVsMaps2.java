package collections.education;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestandoBuscaViaForEachVsMaps2 {
    public static void main(String[] args) {
        Map<Integer, String> jogadores = new HashMap<>();
        jogadores.put(9, "Neymar Jr");
        jogadores.put(10, "Richarlison");
        jogadores.put(28, "Martinelli");


        //Acesso via Set - transforma em um Set
        jogadores.keySet().forEach(item->{
            System.out.println("Jogador: " + jogadores.get(item) + " Camisa: " + item);
        }) ;

        System.out.println();


        //Percorrendo via lambda
        jogadores.forEach((k, v) -> {
            System.out.println("Jogador: " + k + " nome: " + v);
        });

        System.out.println();
        for (Map.Entry<Integer, String> item : Collections.unmodifiableSet(jogadores.entrySet())) {
            System.out.println("Jogador: " + item.getKey() + " nome: " + item.getValue());
        }


        System.out.println();
        System.out.println("Substituindo...28");
        System.out.println();

        jogadores.put(28, "Santos");
        jogadores.forEach((k, v) -> {
            System.out.println("Jogador: " + k + " nome: " + v);
        });


    }
}
