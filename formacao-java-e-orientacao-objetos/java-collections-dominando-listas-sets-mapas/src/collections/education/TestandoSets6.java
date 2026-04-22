package collections.education;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestandoSets6 {
    public static void main(String[] args) throws IOException {
        Set<String> alunos = new HashSet<>();
        alunos.add("Fulano");
        alunos.add("Beltrano");
        alunos.add("Solano");
        alunos.add("Ramos");

        /*
        * Uma das características
        * mais interessantes de JVM é que ela sabe trabalhar em paralelo.
        * Internamente isso é feito por meio de Threads que funcionam como pequenos processos dentro da JVM.
        * O problema é que as coleções que estamos usando até agora
        * não foram feitas para serem manipuladas em paralelo.
        * No entanto, nada impede que usemos um método da classe Collections para transformar
        * uma coleção comum em uma coleção para threads.
        * É justamente isso que o método faz,
        * retorna um nova coleção que pode ser compartilhada entre threads sem perigos.
        * O tópico de Threads é importante pois
        * elas são muito utilizadas dentro das bibliotecas que rodam no mundo Java.
        * Na Alura, temos dois treinamentos dedicados a threads:
        *
        * https://cursos.alura.com.br/course/threads-java-1
        * https://cursos.alura.com.br/course/threads-java-2
        **/

        Set<String> nomes = Collections.synchronizedSet(alunos);

        /*new Runnable() {
            @Override
            public void run() {
                nomes.forEach(item->{
                    System.out.println(item);
                });
            }
        };*/
    }

}
