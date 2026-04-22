package br.com.sfidencio.curso.teste.automatizados;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

        //Vamos refatorar e implementar o padrao Strategy no ENUM
        //Temos um estrategia de reajusta que varia de acordo com desempenho
        //Vamos refatorar para elimitar os if-else


        if (funcionario.getSalario().doubleValue() > 5000)
            throw new IllegalArgumentException("Salario do funcionario nao pode ser reajustado!");

        funcionario.ajustarSalario(funcionario.getSalario().multiply(desempenho.devolverPercentualReajuste()));

        /*if (desempenho.equals(Desempenho.PESSIMO))
            funcionario.ajustarSalario(funcionario.getSalario().multiply(new BigDecimal("0.1"))); //10%
        else if (desempenho.equals(Desempenho.BOM))
            funcionario.ajustarSalario(funcionario.getSalario().multiply(new BigDecimal("0.2"))); //20%
        else
            funcionario.ajustarSalario(funcionario.getSalario().multiply(new BigDecimal("0.3"))); //20%
        */

    }
}
