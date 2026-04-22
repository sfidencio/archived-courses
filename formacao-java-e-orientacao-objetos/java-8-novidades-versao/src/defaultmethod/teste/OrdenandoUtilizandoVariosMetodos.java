package defaultmethod.teste;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoUtilizandoVariosMetodos {
    public static void main(String[] args) {
        //List<String> frutas = new ArrayList<>();
        List frutas = new ArrayList<>();
        frutas.add("Maca");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add(15);
        Integer numeroQualquer =  (Integer)frutas.get(3);
        System.out.println(frutas);
    }
}
