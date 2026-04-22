package com.github.sfidencio.abstratoconcreto;

public class Funcionario extends Pessoa {
    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
