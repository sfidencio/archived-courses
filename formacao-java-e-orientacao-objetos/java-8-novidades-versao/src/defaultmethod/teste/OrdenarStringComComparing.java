package defaultmethod.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import static java.util.Comparator.*;
public class OrdenarStringComComparing {

    public static void main(String[] args) {
        List<String> comidas = new ArrayList<>();
        comidas.add("Carne de Hamburger");
        comidas.add("Arroz");
        comidas.add("Feijao");
        comidas.add("Bife");
        comidas.add("Algas Marinhas");
        comidas.add("Bolacha");
        comidas.add("Queijo");
        comidas.add("Acaraje");
        comidas.add("Açai");

        System.out.println("Usando metodo estatico da classe Comparator");
        System.out.println("Antes de ordenar");
        //comidas.forEach(item-> System.out.println(item));
        System.out.println(comidas);
        System.out.println("Depois de ordenar - Natural");
        comidas.sort(Comparator.naturalOrder());
        System.out.println(comidas);
        System.out.println("Depois de ordenar - Reverse");
        comidas.sort(Comparator.reverseOrder());
        System.out.println(comidas);
        System.out.println();
        System.out.println();

        System.out.println("Utilizando comparacao customizada - usando length");
        comidas.sort(Comparator.comparing(s->s.length()));
        System.out.println(comidas);

        //Quebrando mais o DefaultMethod - //Recebe um Function que e compativel com uma lambda
        Function<String,Integer> funcao = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        //Codigo acima da classe anomima pode virar o codigo abaixo
        //Function<String,Integer> funcao = s->s.length();


        Comparator<String> comparacao = Comparator.comparing(funcao);
        comidas.sort(comparacao);
        System.out.println(comidas);


        //Reduzindo mais ainda o codigo.
        comidas.sort(Comparator.comparing(String::length));
        System.out.println(comidas);

        //Um forma de diferente de escrever lmabda.. mas sao equivalentes  Strig::length e s -> s.length()
        Function<String,Integer> funcao2 = String::length;
        comidas.sort(Comparator.comparing(funcao2));
        System.out.println(comidas);


        //Usando methodReference tb com Consumer.
        comidas.forEach(System.out::println);

        //Exemplo
        Usuario usuario = new Usuario("Fulano","123");
        Function<Usuario,String> funcaoRetornaNome1 = u->u.getNome();
        Function<Usuario,String> funcaoRetornaNome2 = Usuario::getNome;


        //Relemebrando
        comidas.sort(Comparator.comparing(s->s.length()));
        comidas.sort(Comparator.comparing(String::length));

        //No lugar de escrever Comparator.comparing(...) você pode usar o importe estático de comparing(...)
        // pra deixar seu código ainda mais enxuto. De que forma você prefere?

        //so colocar o import abaixo no top da classe
        //import static java.util.Comparator.*;
        comidas.sort(comparing(String::length));


        System.out.println();
        //Mudando comparacao
        comidas.sort(comparing(s->s.equalsIgnoreCase("A")));
        //comidas.sort(comparing(anotherString -> String.equalsIgnoreCase(anotherString)));
        comidas.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(comidas);
        System.out.println();
        System.out.println();

        //mudando forEach para usar methodoReference no lugar de lambda
        comidas.forEach(s->System.out.println(s));
        comidas.forEach(System.out::println);


    }
}
