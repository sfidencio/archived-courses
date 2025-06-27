package collections.education;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestandoListas9 {
    public static void main(String[] args) {
        Curso cursoJPA = new Curso("curso.Curso de JPA", new Instrutor("Fulano de Tal", 55));
        cursoJPA.adicionar(new Aula("Entendendo como funciona o mapeamento objeto relacional", 40));
        cursoJPA.adicionar(new Aula("Aprofundando na especificacao JPA", 15));
        cursoJPA.adicionar(new Aula("Meu primeiro contato com JPA", 59));

        System.out.println(cursoJPA);


        //Tentar modificar a lista ou ordenar
        //cursoJPA.getAulas().sort(Comparator.comparing(item->Integer.valueOf(item.getTempo())));
        //cursoJPA.getAulas().sort(Comparator.reverseOrder()); //Para esse modelo tem que implementar a interface comparator
        //Collections.sort(cursoJPA.getAulas());
        System.out.println();
        System.out.println();
        //Obter lista a ser modificada
        List<Aula> aulasMutaveis = new ArrayList<>(cursoJPA.getAulas());
        System.out.println(aulasMutaveis);
        aulasMutaveis.sort(Comparator.reverseOrder());
        System.out.println(aulasMutaveis);


        System.out.println();
        //Calculando tempo utilizando java funcional
        System.out.println(cursoJPA.calcularTempoFeatureJava8());
        //Calculando tempo utilizando for tradicional
        System.out.println(cursoJPA.calcularTempo());

    }
}
