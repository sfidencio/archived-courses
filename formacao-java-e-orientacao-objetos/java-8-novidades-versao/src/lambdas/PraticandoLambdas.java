package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PraticandoLambdas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        //Classes anonimas
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Number: " + integer);
            }
        });

        System.out.println();

        //Lambda
        numeros.forEach(n -> System.out.println("Number: " + n));

        /*numeros.forEach((n) -> {
            System.out.println("Number: " + n);
        });*/
        System.out.println();
        Consumer<Integer> consumidor = n -> System.out.println(n);
        numeros.forEach(consumidor);

        System.out.println();

        numeros.forEach(new Consumidor());



    }
}
class Consumidor implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println("Numbero: " + integer);
    }
}
