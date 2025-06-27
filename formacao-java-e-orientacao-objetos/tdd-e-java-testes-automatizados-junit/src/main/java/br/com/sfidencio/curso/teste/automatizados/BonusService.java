package br.com.sfidencio.curso.teste.automatizados;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {
    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000.00")) > 0)
            throw new IllegalArgumentException("Funcionario nao pode receber bonus!");
        return valor.setScale(2, RoundingMode.DOWN);
    }
}
