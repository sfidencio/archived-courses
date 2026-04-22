package collections.education;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestandoListas5 {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Entendendo o funcionamento do SpringFramework", 20);
        Aula aula2 = new Aula("Compreendendo os contextos do SpringFramework", 15);
        Aula aula3 = new Aula("Desmistificando JPA", 60);
        List<Aula> listaAulas = new ArrayList<>();
        listaAulas.add(aula1);
        listaAulas.add(aula2);
        listaAulas.add(aula3);
        System.out.println(listaAulas);
        //[curso.Aula@7c30a502, curso.Aula@49e4cb85, curso.Aula@2133c8f8] toString() does not implementation.
        listaAulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(listaAulas);
        listaAulas.sort(Comparator.comparing(Aula::getDescricao).reversed());
        System.out.println(listaAulas);
        listaAulas.sort(Comparator.comparing(Aula::getDescricao));
        System.out.println(listaAulas);
    }
}
