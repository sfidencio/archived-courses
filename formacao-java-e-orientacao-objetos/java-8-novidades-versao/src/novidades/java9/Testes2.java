package novidades.java9;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Testes2 {
    public static void main(String[] args) {
        List<BigDecimal> valores = List.of(new BigDecimal("1.20"), new BigDecimal("3.40"), new BigDecimal("7.80"), new BigDecimal("0.89"));
        System.out.println(valores);
        System.out.println();

        System.out.println("Imprimindo via forEach/Lambda");
        valores.forEach(item -> System.out.println(item));

        /*valores.forEach(new Consumer<BigDecimal>() {
            @Override
            public void accept(BigDecimal bigDecimal) {
                System.out.println("Anonymous: " + bigDecimal);
            }
        });*/

        System.out.println();
        System.out.println("Imprimindo via MethodRefence");
        valores.forEach(System.out::println);

        System.out.println();
        System.out.println("Imprimindo via foreach");
        for (var item : valores)
            System.out.println(item);

        System.out.println();
        System.out.println("Utilizando for antigo via indice");
        for (int i = 0; i < valores.size(); i++)
            System.out.println(valores.get(i));

        System.out.println();
        System.out.println("Utilizando o iterator (Anterior ao java5");
        Iterator<BigDecimal> elemento = valores.iterator();
        while (elemento.hasNext())
            System.out.println(elemento.next());


        System.out.println();
        System.out.println("Imprimindo valores ordenados - A-Z");
        valores.stream().sorted().forEach(System.out::println);
        //valores.stream().forEachOrdered(item-> System.out.println(item));



        System.out.println();
        System.out.println("Imprimindo valores ordenados - Z-A");
        valores.sort(Comparator.reverseOrder());
        System.out.println(valores);


    }
}
