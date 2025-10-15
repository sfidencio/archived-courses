package com.github.sfidencio.explorandofinal;

// A classe Pessoa é declarada como final, o que impede que outras classes herdem dela.
// Isso é útil quando queremos garantir que a implementação da classe não seja alterada por subclasses.
// Tentar estender uma classe final resultará em um erro de compilação.
// public class Cliente extends Pessoa { } // Isso causaria um erro de compilação
public final class Pessoa {

    enum dia {
        SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
    }

    private String nome;
    private final int idade = 30; // Atributo final, não pode ser modificado após a inicialização

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String concatenarNomeComIdade() {
        return this.nome.concat(String.valueOf(this.idade));
    }
}
