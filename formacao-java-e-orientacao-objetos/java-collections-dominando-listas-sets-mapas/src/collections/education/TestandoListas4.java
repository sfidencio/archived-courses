package collections.education;

import java.util.*;

public class TestandoListas4 {
    public static void main(String[] args) {
        String alfabeto = "ABCDEFGHIJLMNOPQUVXZ";
        List<String> alfabetoList = Arrays.asList(alfabeto.split(""));
        System.out.println("Utilizando Anonymous para realizar ordenação.");
        System.out.println(alfabetoList);
        Collections.sort(alfabetoList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(alfabetoList);
        Collections.sort(alfabetoList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(alfabetoList);

        //InterfaceFuncional
        System.out.println("Utilizando FunctionalInterfaces para realizar ordenação.");
        alfabetoList.sort(Comparator.reverseOrder()); //Z-A
        System.out.println(alfabetoList);
        alfabetoList.sort(Comparator.naturalOrder()); //A-Z
        System.out.println(alfabetoList);

        //LambaExpression
        System.out.println("Utilizando expressões Lambdas para realizar ordenação.");
        alfabetoList.sort((s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println(alfabetoList);
        alfabetoList.sort((s1, s2) -> {
            return s2.compareTo(s1);
        });
        System.out.println(alfabetoList);

        System.out.println();
        List<Integer> idades = new ArrayList<>();
        idades.add(10);
        idades.add(20);
        idades.add(5);
        idades.add(120);
        idades.add(7);
        idades.add(3);
        idades.sort(Comparator.naturalOrder());
        System.out.println(idades);
        idades.sort(Comparator.reverseOrder());
        System.out.println(idades);
    }
}
