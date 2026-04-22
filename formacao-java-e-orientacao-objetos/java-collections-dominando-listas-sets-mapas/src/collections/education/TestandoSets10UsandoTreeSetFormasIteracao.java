package collections.education;

import java.io.IOException;
import java.util.*;

public class TestandoSets10UsandoTreeSetFormasIteracao {
    public static void main(String[] args) throws IOException {
        //Deu certo pois a classe String implementa Comparable, se fosse
        //Uma classe criada por nos, teriamos que implementar para utilizar TreeSet
        //Observe que ele se encarrega de ordenar os elementos
        //TreeSet implementa NavigableSet que implementa SortedSet que implementa o Set
        Set<String> nomes = new TreeSet<>();
        nomes.add("Fulano");
        nomes.add("Beltrano");
        nomes.add("Solano");

        System.out.println();
        //java5
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();
        //java8
        nomes.forEach(item ->{
            System.out.println(item);
        });

        System.out.println();
        //java5- ou versões anteriores ao java5
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println();
        //Para colecoes baseadas em arraylist
        List<String> nomesList = new ArrayList<>(nomes);
        for (int i = 0; i < nomesList.size(); i++) {
            System.out.println(nomesList.get(i));
        }





      /*Mas se executarmos a classe
       TestaCursoComAluno,
       receberemos uma exception.
       Isso acontece porque o TreeSet só funciona para classes que implementam a interface Comparable,
       porque internamente o TreeSet guarda os objetos na sua ordem natural,
       que é a ordem implementada por meio do Comparable,
       mas se olharmos a classe Aluno, veremos que ela não implementa essa interface, por isso a exceção é lançada.
       Vamos voltar a utilizar o HashSet,
       o importante aqui é saber que as coleções possuem várias implementações,
       tanto as listas quanto os Sets.*/

    }

}
