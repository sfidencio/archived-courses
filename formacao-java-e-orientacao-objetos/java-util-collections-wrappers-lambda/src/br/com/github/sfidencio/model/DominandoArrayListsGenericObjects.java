package br.com.github.sfidencio.model;

import java.util.ArrayList;
import java.util.List;

public class DominandoArrayListsGenericObjects {
    public static void main(String[] args) {
        List frutas = new ArrayList();
        frutas.add("Maca");
        frutas.add(25);
        frutas.add(Boolean.TRUE);

        for (var item : frutas)
            System.out.println(item);

        try {
            Integer numero = (Integer) frutas.get(0);
        }catch (ClassCastException ex){
            System.out.println("Tipo incompatível :" + ex.getMessage());
        }
    }
}
