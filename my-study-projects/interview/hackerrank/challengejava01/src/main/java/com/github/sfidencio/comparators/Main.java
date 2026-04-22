package com.github.sfidencio.comparators;

import java.util.Comparator;

public class Main {
    static void main() {
        Pessoa pessoa1 = new Pessoa("Fulano", 30);
        Pessoa pessoa2 = new Pessoa("Ciclano", 25);
        System.out.println(pessoa1.compareTo(pessoa2)); // Deve retornar um valor positivo, pois "Fulano" vem depois de "Ciclano" lexicograficamente
        System.out.println(pessoa2.compareTo(pessoa1)); // Deve retornar um valor negativo

        Pessoa pessoa3 = new Pessoa("Fulano", 40);
        Pessoa pessoa4 = new Pessoa("Fulano", 40);
        System.out.println(pessoa3.compareTo(pessoa4)); // Deve retornar 0, pois os nomes são iguais

        PessoaComparator pessoa5 = new PessoaComparator("Fulano", 25);
        PessoaComparator pessoa6 = new PessoaComparator("Fulano", 26);
        Comparator<PessoaComparator> byAge = Comparator.comparingInt(p -> p.getIdade());

        System.out.println(byAge.compare(pessoa5, pessoa6));


    }
}

