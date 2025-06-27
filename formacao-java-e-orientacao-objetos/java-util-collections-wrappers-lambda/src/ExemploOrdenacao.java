import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacao {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                /*if (o1 > o2)
                    return -1;
                if (o1 < 02)
                    return 1;

                return 0;*/

                return Integer.compare(o2,o1); //DESC
                //return Integer.compare(o1,o2); //ASC
            }
        });
        System.out.println(numeros);


        List<String> frutas = new ArrayList<>(0);
        frutas.add("Manga");
        frutas.add("Abacate");
        frutas.add("Maca");
        frutas.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(frutas);
    }
}


