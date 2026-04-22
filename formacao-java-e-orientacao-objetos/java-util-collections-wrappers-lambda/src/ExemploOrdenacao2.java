import br.com.github.sfidencio.model.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacao2 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList(0);
        frutas.add("Maca");
        frutas.add("Abacate");
        frutas.add("Graviola");
        frutas.add("Pessego");
        frutas.add("Zulu");
        frutas.add("Bacaba");
        frutas.add("Melao");
        frutas.add("Morango");
        frutas.add("Uva");
        //frutas.sort((o1, o2) -> o2.compareTo(o1));
        frutas.sort(new OrdenacaoCriterio(TipoOrdenacao.ASC));
        //frutas.sort(new OrdenacaoCriterio(TipoOrdenacao.DESC));
        System.out.println(frutas);

        System.out.println("------------------------------------");
        List<String> frutas2 = new ArrayList(0);
        frutas2.add("Maca");
        frutas2.add("Abacate");
        frutas2.add("Graviola");
        frutas2.add("Pessego");
        frutas2.add("Zulu");
        frutas2.add("Bacaba");
        frutas2.add("Melao");
        frutas2.add("Morango");
        frutas2.add("Uva");

        //Funcoes objetos ou Function Objects com sort da Collections
        Collections.sort(frutas2, new OrdenacaoCriterio(TipoOrdenacao.DESC)); //Usando classe Collections para ordenar


        System.out.println(frutas2);

        System.out.println("--------------------------------------------");
        //Ordem natural
        List<Produto> produtos = new ArrayList<>(0);
        produtos.add(new Produto(1, "Feijao", new BigDecimal("7.20")));
        produtos.add(new Produto(2, "Arroz", new BigDecimal("6.20")));
        produtos.add(new Produto(3, "Carne", new BigDecimal("64.20")));
        produtos.add(new Produto(4, "Balinha", new BigDecimal("0.20")));
        Collections.sort(produtos); //Ordem natural usando Collections
        //produtos.sort(null); //Ordem natural propria lista
        System.out.println(produtos);

        System.out.println("-----------------------------------------");
        //Revertendo os elementos.
        Collections.reverse(produtos);
        System.out.println(produtos);

        System.out.println("-----------------------------------------");
        //Emabralhando
        Collections.shuffle(produtos);
        System.out.println(produtos);


        System.out.println("-----------------------------------------");
        //Rotacionando
        Collections.rotate(produtos, 30);
        System.out.println(produtos);


        System.out.println("------------------LAMBDA--------------------------");
        System.out.println("-----------Antes----------------");
        //Vamos testar o lambda
        List<Produto> produtos2 = new ArrayList<>(0);
        produtos2.add(new Produto(4, "Macarrao", new BigDecimal("71.20")));
        produtos2.add(new Produto(1, "Mandioca", new BigDecimal("6.24")));
        produtos2.add(new Produto(3, "Leite", new BigDecimal("1.30")));
        produtos2.add(new Produto(2, "Pao", new BigDecimal("6.30")));
        System.out.println(produtos2);

        //Utiliznado classe anomima
        /*produtos2.sort(new Comparator<Produto>() {
            @Override
            public int compare(Produto o1, Produto o2) {
                return Integer.compare(o1.getCodigo(), o2.getCodigo());
            }
        });*/
        System.out.println("-------------Depois--------------");
        //Utilizando Lambda
        produtos2.sort((o1,o2)-> Integer.compare(o2.getCodigo(),o1.getCodigo()));
        /*produtos2.sort((o1,o2)->{
            return Integer.compare(o1.getCodigo(),o2.getCodigo()); //ASC
        });*/
        System.out.println(produtos2);


        System.out.println("------------------METHOD--------------------------");
        System.out.println("-----------Antes----------------");
        //Vamos testar o lambda
        List<Produto> produtos3 = new ArrayList<>(0);
        produtos3.add(new Produto(3, "Leite", new BigDecimal("1.30")));
        produtos3.add(new Produto(1, "Mandioca", new BigDecimal("6.24")));
        produtos3.add(new Produto(4, "Macarrao", new BigDecimal("71.20")));
        produtos3.add(new Produto(2, "Pao", new BigDecimal("6.30")));
        System.out.println(produtos3);



    }
}

class OrdenacaoCriterio implements Comparator<String> {

    TipoOrdenacao tipoOrdenacao;

    public OrdenacaoCriterio(TipoOrdenacao tipoOrdenacao) {
        this.tipoOrdenacao = tipoOrdenacao;
    }

    @Override
    public int compare(String o1, String o2) {

        if (tipoOrdenacao.equals(TipoOrdenacao.ASC))
            return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
        else
            return String.CASE_INSENSITIVE_ORDER.compare(o2, o1);
        /*if(tipoOrdenacao.equals(TipoOrdenacao.ASC))
            return o1.compareTo(o2);
        else
            return o2.compareTo(o1);*/
    }
}

enum TipoOrdenacao {
    ASC, DESC
}
