package com.github.sfidencio.abstratoconcreto;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        super.apresentar();
    }
}
