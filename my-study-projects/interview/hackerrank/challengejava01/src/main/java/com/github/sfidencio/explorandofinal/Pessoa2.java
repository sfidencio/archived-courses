package com.github.sfidencio.explorandofinal;

public class Pessoa2 {
    private String nome;

    public Pessoa2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Note que o método apresentar é protegido, ou seja,
    // pode ser acessado por subclasses ou classes do mesmo pacote
    // o final impede que subclasses sobrescrevam esse método
    protected final void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
