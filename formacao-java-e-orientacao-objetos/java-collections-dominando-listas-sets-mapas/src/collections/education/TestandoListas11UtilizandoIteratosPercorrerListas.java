package collections.education;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
*
* Mas existe uma implementação de Set
* que guarda a ordem em que os elementos foram adicionados, o LinkedHashSet.
* Podemos testá-lo, utilizando-o na classe Curso:
*
*  Os alunos foram impressos exatamente na
* mesma ordem em que foram adicionados no Set, diferentemente do HashSet
* Então há implementações de conjuntos que guardam a ordem que os elementos
* foram adicionados. Você pode pensar:
* "Mas foi falado que a ordem não é preservada".
* E ela não é! O Set não guarda a ordem dos elementos,
* nem tem como acessá-la, a própria interface diz isso.
* Por isso, mesmo utilizando LinkedHashSet,
* não conseguimos invocar o método get,
* mas na hora de percorrer o conjunto com um
* foreach os seus elementos virão na ordem em que foram adicionados.
*/

public class TestandoListas11UtilizandoIteratosPercorrerListas {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Joao");
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Carlos");//Nao aceita elemento repetido, pois classe String tem internamente imp. de hashcode e equals
        nomes.add("Gildasio");
        nomes.add("Ana");
        nomes.add("Jonas");



        System.out.println("Nestes casos nao podemos utilizar o for tradicional, que percorre pelo indice!");

        //Como faço para iterar sobre os elementos apartir java 8
        System.out.println("Como faço para iterar sobre os elementos(Sets que nao possui indices) apartir java 8");
        nomes.forEach(item->{
            System.out.println(item);
        });

        System.out.println();
        System.out.println("Como faço para iterar sobre os elementos(Sets que nao possui indices) java 7 - Utilizando foreach");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();
        System.out.println("Como faço para iterar sobre os elementos(Sets que nao possui indices) java 7 para trás. (Codigos Legados Utilizam)");
        Iterator<String> stringIterator = nomes.iterator();
        while(stringIterator.hasNext())
            System.out.println(stringIterator.next());

        //Se tentar acessar o iterator depois de ja iteragirmos?
        //Receberemos um java.util.NoSuchElementException
        //Descomente o codigo e teste...
        //String teste = stringIterator.next();

    }
}
