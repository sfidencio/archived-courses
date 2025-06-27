import br.com.github.sfidencio.model.Conta;
import br.com.github.sfidencio.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EstudoArrayList {
    public static void main(String[] args) {
        //ArrayList utiliza Array por baixo dos panos
        ArrayList listGenerica = new ArrayList(0);
        listGenerica.add(new Conta(1, "Fulano", "1111111111111"));
        listGenerica.add(new Produto(1, "Arroz", new BigDecimal("25.00")));
        listGenerica.forEach(item -> {
            System.out.println(item);
        });

        //Produto p1 = (Produto)listGenerica.get(1);
        for (Object o : listGenerica)
            if (o instanceof Produto)
                System.out.println(o);


        //Removendo
        //System.out.println("Removido: " + listGenerica.remove(0));
        Produto p1 = (Produto) listGenerica.get(1);
        System.out.println("Removido: " + listGenerica.remove(p1));

        //Tipificando
        ArrayList<Integer> numerosPares = new ArrayList<>(0);
        numerosPares.add(2);
        numerosPares.add(4);
        numerosPares.add(6);
        numerosPares.add(8);
        numerosPares.add(10);
        numerosPares.add(12);
        for (Integer numerosPare : numerosPares)
            System.out.println(numerosPare);

        Boolean isExiste = numerosPares.contains(numerosPares.get(0));
        System.out.println("Existe: " + isExiste);


        String[] frutas = {"Maca", "Banana", "Pera", "Uva", "Morango", "Melao", "Manga"};
        String result =
                Arrays.asList(frutas).stream().filter(item -> item.startsWith("M")).findFirst().orElse("Erro ao tentar obter elemento.");

        List<String> resultList =
                Arrays.asList(frutas).stream().filter(item -> item.endsWith("a")).collect(Collectors.toList());

        resultList.forEach(item -> {
            System.out.println("ResultList: " + item);
        });

        System.out.println();
        System.out.println("Resultado: " + result);
    }
}
