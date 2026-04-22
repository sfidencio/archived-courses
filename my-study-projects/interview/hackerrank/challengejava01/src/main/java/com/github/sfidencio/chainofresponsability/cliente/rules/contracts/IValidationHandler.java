package com.github.sfidencio.chainofresponsability.cliente.rules.contracts;

import com.github.sfidencio.chainofresponsability.cliente.dominio.Cliente;

/**
 * Interface para abstrair o handler de validação no padrão Chain of Responsibility.
 * Cada implementação deve realizar uma validação específica sobre o objeto Cliente
 * e, caso necessário, delegar a validação para o próximo handler na cadeia.
 *
 * <p>Exemplo de uso tradicional (encadeando manualmente):</p>
 * <pre>
 * IValidationHandler handler1 = new FieldEmptyOrNullValidator();
 * IValidationHandler handler2 = new EmailValidator();
 * IValidationHandler handler3 = new LimiteRendaValidator();
 * handler1.setNext(handler2);
 * handler2.setNext(handler3);
 * handler1.execute(cliente);
 * </pre>
 *
 * <p>Exemplo de uso alternativo (com lista e laço):</p>
 * <pre>
 * List<IValidationHandler> handlers = List.of(
 *     new FieldEmptyOrNullValidator(),
 *     new EmailValidator(),
 *     new LimiteRendaValidator()
 * );
 * for (int i = 0; i < handlers.size() - 1; i++)
 *     handlers.get(i).setNext(handlers.get(i + 1));
 * handlers.get(handlers.size() - 1).setNext(null);
 * handlers.get(0).execute(cliente);
 * </pre>
 *
 * @author sfidencio
 * @since 1.0
 */
public interface IValidationHandler {
    void execute(Cliente cliente);

    void setNext(IValidationHandler handler);
}