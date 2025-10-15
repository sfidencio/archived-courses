package com.github.sfidencio.explorandofinal;

public class ClienteHerdandoNaoSobrescritaFinal extends Pessoa2 {
    public ClienteHerdandoNaoSobrescritaFinal(String nome) {
        super(nome);
    }

    // Tentativa de sobrescrever o método final da classe Pessoa2
    // Isso causará um erro de compilação porque o método apresentar é final
//    @Override
//    public void apresentar() {
//        System.out.println("Olá, meu nome é " + nome);
//    }
}
