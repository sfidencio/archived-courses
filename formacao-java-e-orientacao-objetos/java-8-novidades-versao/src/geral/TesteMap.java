package geral;

import defaultmethod.teste.Impressora2;
import defaultmethod.teste.ImpressoraImp;

import java.util.*;

public class TesteMap {
    public static void main(String[] args) {
        //simular a persistencia
        /*Map<String,String> mapa = new LinkedHashMap<>();
        mapa.put("a0","001");
        mapa.put("a1","002");
        mapa.put("a3","003");

        System.out.println(mapa.isEmpty());
        System.out.println(mapa != null);

        System.out.println();
        System.out.println();*/


        Map<String,String> mapa2 = null; // = new LinkedHashMap<>();

        //System.out.println(mapa2.isEmpty());
        System.out.println(mapa2 != null);

        List<Map<String,String>> linhas2 =  new ArrayList<>();
        linhas2.add(mapa2);
        linhas2.forEach(item-> {
            if(item!=null && !item.isEmpty()) {
                System.out.println(item.get("a1"));
            }
        });



        /*List<Map<String,String>> linhas =  new ArrayList<>();

        linhas.add(mapa);

        linhas.forEach(item-> {
            System.out.println(item.get("a1"));
        });*/



        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        Iterator itx = numeros.iterator();

        //--anterior java5 .. java 1.2 e m 1997
        while(itx.hasNext()){
            System.out.println(itx.next());
        }

        while(itx.hasNext()){
            System.out.println(itx.next());
        }
        //java5
        /*for (Integer numero : numeros) {
            System.out.println(numero);
        }*/

        //java8
        //numeros.forEach(item-> System.out.println(item));


        //Teste defaultMethod
        Impressora2 impressora2 = new ImpressoraImp();
        impressora2.imprimir("Teste");

    }
}
