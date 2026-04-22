package com.github.sfidencio.chainofresponsability.cliente.rules.chain;

import com.github.sfidencio.chainofresponsability.cliente.dominio.Cliente;
import com.github.sfidencio.chainofresponsability.cliente.rules.contracts.IValidationHandler;

public class EmailValidator implements IValidationHandler {

    private IValidationHandler next;
    private final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    @Override
    public void execute(Cliente cliente) {
        String email = cliente.email();

        if (!email.matches(emailRegex)) {
            throw new IllegalArgumentException("Email inválido");
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
