package com.github.sfidencio.collections;

public class Main {
    static void main() {
        Pessoa pessoa = new Pessoa("Sebastiao",40);
        System.out.println(pessoa);
        pessoa.adicionarEndereco(new Endereco(
                "Rua A","Anapolis","Bairro B","123456"
        ));
        System.out.println(pessoa);
        pessoa.adicionarEndereco(new Endereco(
                "Rua A","Anapolis","Bairro B","123456"
        ));
        System.out.println(pessoa);
        pessoa.adicionarEndereco(new Endereco(
                "Rua B","Anapolis","Bairro B","123456"
        ));
        System.out.println(pessoa);
    }
}
