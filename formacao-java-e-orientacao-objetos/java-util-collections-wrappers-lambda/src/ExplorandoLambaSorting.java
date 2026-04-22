import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ExplorandoLambaSorting {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>(0);
        precos.add(1.1);
        precos.add(1.2);
        precos.add(1.3);
        precos.add(1.4);
        precos.sort((Double n1, Double n2) -> {
            return Double.compare(n2, n1);
        });
        System.out.println(precos);
        Comparator<Double> comp = (var o1, var o2) -> {
            return Double.compare(o1, o2);
        };

        precos.sort(comp);
        System.out.println(precos);

        precos.sort((o1, o2) -> Double.compare(o2, o1));
        System.out.println(precos);

        //ForEach - Utilizando classe anonima.
        precos.forEach(new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println(aDouble);
            }
        });

        System.out.println("-----------------------------");
        precos.sort((o1, o2) -> Double.compare(o1, o2));
        //ForEach - Lambda
        /*precos.forEach(item -> {
            System.out.println(item);
        });*/

        /*precos.forEach((var item) -> {
            System.out.println(item);
        });*/

        precos.forEach(item-> System.out.println(item));


    }
}
