package br.com.sfidencio.estoque.estoqueapi.config;

import br.com.sfidencio.estoque.estoqueapi.exceptions.EstoqueInsuficienteException;
import br.com.sfidencio.estoque.estoqueapi.exceptions.RecursoNaoEncontradoException;
import br.com.sfidencio.estoque.estoqueapi.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    @ExceptionHandler(RecursoNaoEncontradoException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody ExceptionResponse handleRecursoNaoEncontrado(final HttpServletRequest request, final RecursoNaoEncontradoException exception) {
        ExceptionResponse error = new ExceptionResponse();
        error.setMensagem(exception.getMessage());
        error.setUrlRequisitada(request.getRequestURI());
        return error;
    }

    @ExceptionHandler(EstoqueInsuficienteException.class)
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY)
    public @ResponseBody ExceptionResponse handleEstoqueInsuficiente(final HttpServletRequest request, final RecursoNaoEncontradoException exception) {
        ExceptionResponse error = new ExceptionResponse();
        error.setMensagem(exception.getMessage());
        error.setUrlRequisitada(request.getRequestURI());
        return error;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody ExceptionResponse handleException(final HttpServletRequest request, final RecursoNaoEncontradoException exception) {
        ExceptionResponse error = new ExceptionResponse();
        error.setMensagem(exception.getMessage());
        error.setUrlRequisitada(request.getRequestURI());
        return error;
    }
}
