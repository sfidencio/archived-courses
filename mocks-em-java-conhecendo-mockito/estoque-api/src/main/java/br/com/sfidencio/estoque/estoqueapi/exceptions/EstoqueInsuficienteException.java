package br.com.sfidencio.estoque.estoqueapi.exceptions;

public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException() {
    }

    public EstoqueInsuficienteException(String message) {
        super(message);
    }
}
