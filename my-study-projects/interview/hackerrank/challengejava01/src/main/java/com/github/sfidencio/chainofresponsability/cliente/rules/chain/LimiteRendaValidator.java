package com.github.sfidencio.chainofresponsability.cliente.rules.chain;

import com.github.sfidencio.chainofresponsability.cliente.dominio.Cliente;
import com.github.sfidencio.chainofresponsability.cliente.rules.contracts.IValidationHandler;

import java.math.BigDecimal;

public class LimiteRendaValidator implements IValidationHandler {

    private IValidationHandler next;

    @Override
    public void execute(Cliente cliente) {
        if (cliente.rendaMensal().compareTo(new BigDecimal(1350.00)) <= 0 ||
                cliente.rendaMensal().compareTo(new BigDecimal(1600)) >= 0) {
            throw new IllegalArgumentException("Renda mensal deve ser maior que 1350 e menor que 1600");
        }
    }

    @Override
    public void setNext(IValidationHandler handler) {
        this.next = handler;
    }
}
