package br.com.sfidencio.service.implementation;

import java.math.BigDecimal;

public class Pessoa {
    private String nome;
    private BigDecimal limiteCredito;

    public Pessoa() {
    }

    public Pessoa(String nome, BigDecimal limiteCredito) {
        this.nome = nome;
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "br.com.sfidencio.service.implementation.Pessoa{" +
                "nome='" + nome + '\'' +
                ", limiteCredito=" + limiteCredito +
                '}';
    }
}
