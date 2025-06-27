package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
 *Default Methods
 *Para evitar essa quebra,
 *o Java 8 optou por criar um novo recurso que possibilitasse adicionar métodos em interfaces
 *e implementá-los ali mesmo! Se você abrir o código fonte da interface List
 */

public class OrdenaString {
    public static void main(String[] args) {
        //Ordem alfabetica ou lexicografica, utiliza comparable pra ordenar
        List<String> palavras = new ArrayList<>();
        palavras.add("Jorge Ramos");
        palavras.add("Balbino da Silva Sauro");
        palavras.add("Presidente da Republica");
        palavras.add("Zema");
        palavras.add("Deputado Federal");
        palavras.add("Ministro de Estado");
        palavras.add("Alvaro");

        Collections.sort(palavras);
        System.out.println("Ordenar palavras por ordem lexicografica: ");
        System.out.println(palavras);

        System.out.println();
        //Ordenar por tamanho
        Collections.sort(palavras, new OrdenarStringPorTamanhoMaiorMenor());
        System.out.println("Ordenar palavras por tamanho: (Maior para Menor) ");
        System.out.println(palavras);

        System.out.println();
        //Ordenar por tamanho
        Collections.sort(palavras, new OrdenarStringPorTamanhoMenorMaior());
        System.out.println("Ordenar palavras por tamanho: (Menor para Maior) ");
        System.out.println(palavras);

        //Resumindo
        /*palavras.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });*/
        palavras.sort((o1, o2) -> Integer.compare(o1.length(),o2.length()));


        Consumer<String> impressor = s-> System.out.println(s);
        palavras.forEach(impressor);
        System.out.println();

        Consumer<String> impressor2 = s-> System.out.println(s +"-xyz");

        Consumer<String> impressor3 = System.out::println;
        palavras.forEach(impressor3);

        Comparator<String> comparator = (s1,s2) -> Integer.compare(s1.length(),s2.length());
        Comparator<String> comparator2 = Comparator.comparingInt(String::length);

        palavras.sort(comparator2);

        System.out.println(palavras);

        Comparator<String> comparator3 = Comparator.comparingInt(String::length).reversed();

        palavras.sort(comparator3);

    }
}
//Nao utilizaremos default do java
class OrdenarStringPorTamanhoMaiorMenor implements Comparator<String> {
    @Override
    //Comparando por tamanho, ao inves de ordem alfabetica.
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length())
            return 1;
        if(o1.length()>o2.length())
            return -1;
        return 0;
    }
}

class OrdenarStringPorTamanhoMenorMaior implements Comparator<String> {
    @Override
    //Comparando por tamanho, ao inves de ordem alfabetica.
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length())
            return -1;
        if(o1.length()>o2.length())
            return 1;
        return 0;
    }
}