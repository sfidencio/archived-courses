package collections.education;

import java.util.List;
import java.util.Vector;

public class TestandoVectorLegado {
    public static void main(String[] args) {
        /*
        * Essa classe é muito antiga e se parece com o ArrayList,
        * inclusive ela implementa List atualmente.
        * A diferença é que ela pode ser utilizada por várias threads simultaneamente,
        * chamado de thread safe. Não vamos entrar em muitos detalhes,
        * o que pode ser dito é que todas as coleções
        * faladas aqui até agora não são seguras quando utilizadas em várias threads,
        * simultaneamente.
        * Isso quer dizer que invocar vários métodos add, get, etc,
        * pode acarretar algo que não esperamos, como que um "atropele" o outro,
        * elementos sumirem, exceptions...
        * A Vector não, ela sempre funciona,
        * mesmo assim não é recomendada a sua utilização,
        * já que existem outras formas de se trabalhar com coleções de maneira thread safe.
        * O que aprendemos neste capítulo:
        * As implementações LinkedHashSet e TreeSet.
        * Iteração de uma coleção utilizando o Iterator.
        * A antiga classe Vector.
        * */
        List<String> jogadores = new Vector<>();
        jogadores.add("Joao");
        jogadores.add("Savio");
        jogadores.add("Renan");
        jogadores.add("Ronaldo");
        jogadores.forEach(s -> System.out.println(s));
   }

}
