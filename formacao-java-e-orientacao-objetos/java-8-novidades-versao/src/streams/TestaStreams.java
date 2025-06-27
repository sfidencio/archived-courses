package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {
    public static void main(String[] args) throws Exception {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz Cristal", 400.00));
        produtos.add(new Produto("Feijao Cristal", 250.00));
        produtos.add(new Produto("Acucar Cristal", 50.00));
        produtos.add(new Produto("Macarrao Cristal", 920.00));
        produtos.add(new Produto("Extrato Tomate Quero", 15.00));
        produtos.add(new Produto("Leite Piracanjuba", 35.00));

        //Ordenando
        System.out.println("A-Z - Estoque - Do maior para o menor");
        produtos.sort(Comparator.comparing(Produto::getEstoque));
        produtos.forEach(s -> System.out.printf("Descricao: %s, Estoque: %.2f%n", s.getDescricao(), s.getEstoque()));
        //produtos.forEach(System.out::println);
        System.out.println();
        System.out.println("Z-A - Estoque - Do maior para o menor");
        produtos.sort(Comparator.comparing(Produto::getEstoque).reversed());
        produtos.forEach(s -> System.out.printf("Descricao: %s, Estoque: %.2f%n", s.getDescricao(), s.getEstoque()));

        //poderia utilizar comparingInt/Double..etc
        produtos.sort(Comparator.comparingDouble(c -> c.getEstoque()));
        produtos.sort(Comparator.comparingDouble(Produto::getEstoque));

        //Como objeto e composto, implemente o toString()..
        //produtos.forEach(System.out::println);

        System.out.println();
        System.out.println();

        //Utilizando stream (a mesma utiliza design patter chamada interface fluente.que permite encadear chamadas)
        //Tais chamadas podem mudar o retorno..a medida em que formos descendo os niveis de chamadas.
        //var listaNovaProdutos = produtos.stream().collect(Collectors.toList());

        //Aplicando filtros
        var listaNovaProdutos =
                produtos.stream()
                        .filter(p -> p.getEstoque() < 100)
                        .collect(Collectors.toList());


        listaNovaProdutos.forEach(p -> System.out.println(p.getDescricao() + " - " + p.getEstoque()));

        System.out.println();
        System.out.println();
        //Agora vamos mapear o stream, que seja filtrado ou nao para um novo objeto
        /*var obj =
                produtos.stream()
                        .max(Comparator.comparing(Produto::getEstoque))
                        .stream().findFirst();
        System.out.println(obj.get().getDescricao() + " - " + obj.get().getEstoque());*/

        //Mapeando objeto do stream, pegando produto com maior estoque para novo objeto.
        var objTransformado =
                produtos.stream()
                        .max(Comparator.comparing(Produto::getEstoque))
                        .map(m -> new OutroObjetoProdutoTransformado(m.getDescricao(), m.getEstoque()))
                        .stream().findFirst();

        System.out.println(objTransformado.get());

        //Streams e collections nao sao a mesma coisa

        System.out.println();
        System.out.println();
        //Filtrando produtos com estoque maior que 100
        var objQualquer = produtos.stream()
                .filter(p -> p.getEstoque() < 250)
                .map(e -> e.getEstoque())
                .findFirst();
        //.skip(1)
        //.forEach(System.out::println);
        //.forEach(e-> System.out.println(e.getDescricao()));


        try {
            System.out.println(objQualquer.orElseThrow(() -> new Exception("Valor nao encontrado")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        /*Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos?
        Podemos fazer essa projeção utilizando o método map:
        Stream<String> nomes = cursos.stream().map(Curso::getNome);*/

        //Media
        System.out.println();
        System.out.println("Media: ");
        produtos.stream().mapToDouble(c -> c.getEstoque()).average().stream().findFirst().ifPresent(System.out::println);

        //Soma
        System.out.println();
        System.out.println("Soma: ");
        var soma = produtos.stream().mapToDouble(c -> c.getEstoque()).sum();
        System.out.println(soma);


        //Usando findAny()
        produtos.stream()
                .filter(c -> c.getEstoque() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getDescricao() + " - " + c.getEstoque()));


        System.out.println();
        System.out.println();

        var qualquerValor2 = produtos.stream()
                .filter(c -> c.getEstoque() > 100)
                .findAny();


        System.out.println(qualquerValor2.get().getDescricao());


        //Nao existe
        var qualquerValor3 = produtos.stream()
                .filter(c -> c.getEstoque() > 10000)
                .findAny();


        try {
            System.out.println(qualquerValor3.get().getDescricao());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //Nao existe - como evitar
        var qualquerValor4 = produtos.stream()
                .filter(c -> c.getEstoque() > 10000)
                .findAny();


        Produto p = qualquerValor4.orElse(new Produto("Qualquer coisa", 2.20));

        System.out.println(p.getDescricao() + " - " + p.getEstoque());


        System.out.println("STREAM é imutavel tambem");
    }
}
