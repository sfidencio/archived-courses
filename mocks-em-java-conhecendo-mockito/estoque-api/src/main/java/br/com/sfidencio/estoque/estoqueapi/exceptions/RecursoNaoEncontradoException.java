package br.com.sfidencio.estoque.estoqueapi.exceptions;

public class RecursoNaoEncontradoException extends Exception {
    public RecursoNaoEncontradoException() {
    }

    public RecursoNaoEncontradoException(String message) {
        super(message);
    }
}
