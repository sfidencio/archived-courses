package br.com.sfidencio.estoque.estoqueapi;

import br.com.sfidencio.estoque.estoqueapi.domain.dao.ClienteDAO;
import br.com.sfidencio.estoque.estoqueapi.domain.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

public class UtilizandoMetodosEstaticosMockito {
    //Usar mock permite simular comportamentos externos, para nao cairmos no teste de integracao
    @Test
    void hello() {
        ClienteDAO mock = Mockito.mock(ClienteDAO.class);
        Optional<Cliente> clienteFound = Optional.ofNullable(mock.obterCliente(1L));
        Assertions.assertTrue(clienteFound.isEmpty());
    }
}
