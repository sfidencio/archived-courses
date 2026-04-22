package com.github.sfidencio.collections;

import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private int idade;
    private Set<Endereco> enderecos = new HashSet<>();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void adicionarEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", enderecos=" + enderecos +
                '}';
    }
}
