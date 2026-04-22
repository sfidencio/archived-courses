package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestaStreams2 {
    public static void main(String[] args) throws Exception {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz Cristal", 400.00));
        produtos.add(new Produto("Feijao Cristal", 250.00));
        produtos.add(new Produto("Acucar Cristal", 50.00));
        produtos.add(new Produto("Macarrao Cristal", 920.00));
        produtos.add(new Produto("Extrato Tomate Quero", 15.00));
        produtos.add(new Produto("Leite Piracanjuba", 35.00));

        //Convertendo para um map a stream
        var map = produtos.stream().filter(c -> c.getEstoque() > 250).collect(Collectors.toMap(c -> c.getDescricao(), c -> c.getEstoque()));

        map.forEach((k, v) -> System.out.println("Chave: " + k + " - " + " Valor: " + v));


        System.out.println();
        //Concatenando string
        var teste = produtos.stream().map(c -> c.getDescricao()).collect(Collectors.joining(", "));

        System.out.println(teste);


        System.out.println();
        System.out.println("Utilizando parallel");
        //Outras vantagens do Stream
        produtos.parallelStream().filter(p -> p.getEstoque() > 50).collect(Collectors.toList()).forEach(j -> System.out.println(j.getDescricao() + " - " + j.getEstoque()));



        //Stream<Double> faz autoboxing ou DoubleStream
        Stream<Double> obj1  = produtos.stream()
                .map(c->c.getEstoque());
        System.out.println(obj1.mapToDouble(c->c.doubleValue()).sum());



        //Assim ja esta pronto nao faz AutoBoxing
        DoubleStream obj2  = produtos.stream()
                .mapToDouble(c->c.getEstoque());
        System.out.println(obj2.sum());


    }
}
