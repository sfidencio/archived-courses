package defaultmethod.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ImprimindoForEach {
    public static void main(String[] args) {

        //forEach é um defaultMethod
        List<String> palavras = new ArrayList<>();
        palavras.add("Um");
        palavras.add("Dois");
        palavras.add("Tres");
        palavras.add("Quatro");
        palavras.add("Cinco");
        palavras.forEach(new ImprimeLinha());
        System.out.println();
        //forEach é um defaultMethod da classe Iterable
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println();

        palavras.forEach(s -> System.out.println(s));//Lambda

        palavras.forEach((String s) -> {
            System.out.println(s + "-1");
        });

    }
}

class ImprimeLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
