import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterandoListasIterator {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>(0);
        frutas.add("Maca");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("Abacate");
        frutas.sort((o1, o2) -> o1.compareTo(o2));

        //Iterator<String> it = frutas.iterator();
        for (Iterator<String> iter = frutas.iterator(); iter.hasNext(); )
            System.out.println(iter.next());


        List<Integer> idades = new ArrayList<>(0);
        idades.add(25);
        idades.add(58);
        idades.add(92);
        idades.add(17);
        idades.add(8);
        idades.sort((o1, o2) -> o2.compareTo(o1));
        //Usando Iterator para percorrer cada elemento de uma lista.
        Iterator<Integer> it = idades.iterator();
        while (it.hasNext())
            System.out.println("Idade: " + it.next());

    }
}
