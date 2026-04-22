package com.github.sfidencio.chainofresponsability.cliente.rules.chain;

import com.github.sfidencio.chainofresponsability.cliente.dominio.Cliente;
import com.github.sfidencio.chainofresponsability.cliente.rules.contracts.IValidationHandler;

public class FieldEmptyOrNullValidator implements IValidationHandler {

    private IValidationHandler next;

    @Override
    public void execute(Cliente cliente) {
        if (cliente.nome() == null || cliente.nome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        if (cliente.email() == null || cliente.email().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }
        if (cliente.rendaMensal() == null || cliente.rendaMensal().doubleValue() <= 0) {
            throw new IllegalArgumentException("Renda mensal não pode ser nulo");
        }

        if (this.next != null) {
            this.next.execute(cliente);
        }
    }

    @Override
    public void setNext(IValidationHandler handler) {
        this.next = handler;
    }
}
