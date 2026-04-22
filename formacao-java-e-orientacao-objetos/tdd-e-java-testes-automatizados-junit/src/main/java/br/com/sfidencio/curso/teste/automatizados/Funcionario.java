package br.com.sfidencio.curso.teste.automatizados;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {
    private String nome;
    private BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return this.salario.setScale(2, RoundingMode.HALF_UP);
    }

    public void ajustarSalario(BigDecimal reajuste) {
        this.salario = reajuste.add(this.salario);
    }
}
