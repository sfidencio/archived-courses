import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DiferenciandoListas {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(0);
        frutas.add("Maca");
        frutas.add("Pera");
        frutas.add("Banana");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Maca");
        linkedList.add("Pera");
        linkedList.add("Banana");
        linkedList.add("Melao");
        linkedList.add("Manga");
        linkedList.add("Abacate");
        linkedList.add("Jilo");
        for (String s : linkedList) {
            System.out.println(s);
        }


        System.out.println("Ultimo: " + linkedList.getLast());
        System.out.println();
        System.out.println("Primeiro: " + linkedList.getFirst());

    }
}
