package collections.education;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas3 {
    public static void main(String[] args) {
        String curso1 = "ArrayList utiliza um Array internamente, portanto mantem a ordem em que os elementos foram inseridos.";
        String curso2 = "Bora aprender Java?";
        String curso3 = "O Estudo de banco de dados é essencial!";

        List<String> ordenandoArrayList = new ArrayList<>();
        ordenandoArrayList.add(curso3);
        ordenandoArrayList.add(curso2);
        ordenandoArrayList.add(curso1);

        System.out.println(ordenandoArrayList);

        Collections.sort(ordenandoArrayList);
        System.out.println("Apos ordenar...");

        System.out.println(ordenandoArrayList);

        System.out.println("Lembrem-se se que a classe String implementa a interface comparable, logo nao precisa passar a forma como sera comparado a String. Agora um objeto criado por nós, devemos indicar como sera o metodo de comparacao.");

    }
}
