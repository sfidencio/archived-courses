package com.github.sfidencio.chainofresponsability.cliente.rules;

import com.github.sfidencio.chainofresponsability.cliente.dominio.Cliente;
import com.github.sfidencio.chainofresponsability.cliente.rules.chain.EmailValidator;
import com.github.sfidencio.chainofresponsability.cliente.rules.chain.FieldEmptyOrNullValidator;
import com.github.sfidencio.chainofresponsability.cliente.rules.chain.LimiteRendaValidator;
import com.github.sfidencio.chainofresponsability.cliente.rules.contracts.IValidationHandler;

import java.util.ArrayList;
import java.util.List;

public class ClienteValidationUseCase {

    private List<Cliente> dbfake = new ArrayList<>();

    private List<IValidationHandler> validationHandlers = List.of(
            new FieldEmptyOrNullValidator(),
            new EmailValidator(),
            new LimiteRendaValidator()
    );

    private void triggerValidationChain(Cliente cliente) {
        for (int i = 0; i < this.validationHandlers.size() - 1; i++)
            validationHandlers.get(i).setNext(validationHandlers.get(i + 1));
        this.validationHandlers.get(validationHandlers.size() - 1).setNext(null);
        this.validationHandlers.get(0).execute(cliente);
    }

    public void save(Cliente cliente) {
        triggerValidationChain(cliente);
        this.dbfake.add(cliente);
    }

    public List<Cliente> getDbfake() {
        return dbfake;
    }
}
