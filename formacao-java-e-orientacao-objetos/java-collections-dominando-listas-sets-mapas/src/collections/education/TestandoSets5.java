package collections.education;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

public class TestandoSets5 {
    public static void main(String[] args) throws IOException {
        //Exception in thread "main" java.lang.UnsupportedOperationException

        /*
         *Um conjunto destinado a ser vazio não pode ter um elemento, certo?
         *Então faz sentido receber essa exceção. Mas para que um conjunto vazio poderia ser útil?
         *Por exemplo, imagina que você precisa representar um
         *curso que foi cancelado pois não teve matriculas. Nesse caso faria
         * todo sentido devolver um Collections.emptySet()
         */
        Collection<String> nomes = Collections.emptySet();
        nomes.add("Joao");
        nomes.add("Celso");
        nomes.add("Pedro");

        System.out.println(nomes);
    }

}
