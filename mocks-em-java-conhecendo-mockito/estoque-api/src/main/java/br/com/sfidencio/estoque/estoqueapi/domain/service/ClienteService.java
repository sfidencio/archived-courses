package br.com.sfidencio.estoque.estoqueapi.domain.service;


import br.com.sfidencio.estoque.estoqueapi.domain.dao.ClienteDAO;
import br.com.sfidencio.estoque.estoqueapi.domain.model.Cliente;
import br.com.sfidencio.estoque.estoqueapi.exceptions.RecursoNaoEncontradoException;
import br.com.sfidencio.estoque.estoqueapi.request.ClienteRequest;
import br.com.sfidencio.estoque.estoqueapi.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    /*@Autowired
    private ClienteDAO clienteDAO;*/
    private ClienteDAO clienteDAO;

    @Autowired
    public ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public ClienteResponse cadastrar(ClienteRequest req) {
        Cliente cliente = new Cliente();
        cliente.setNome(req.getNome());
        cliente.setLimiteCredito(req.getLimiteCredito());
        //Cliente clienteSalvo = new Cliente();
        Cliente clienteSalvo = this.clienteDAO.cadastrarCliente(cliente);
        return new ClienteResponse(clienteSalvo.getId(), clienteSalvo.getNome(), clienteSalvo.getLimiteCredito());
    }

    public ClienteResponse consultar(Long id) throws Exception {
        Optional<Cliente> cliente = Optional.ofNullable(this.clienteDAO.obterCliente(id));
        if (cliente.isEmpty())
            throw new RecursoNaoEncontradoException("Cliente não encontrado!");
        return ClienteResponse.builder()
                .id(cliente.get().getId())
                .nome(cliente.get().getNome())
                .limiteCredito(cliente.get().getLimiteCredito())
                .build();
    }

    public ClienteResponse atualizar(ClienteResponse clienteAtualizar) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteAtualizar.getId());
        cliente.setNome(clienteAtualizar.getNome());
        cliente.setLimiteCredito(clienteAtualizar.getLimiteCredito());
        this.clienteDAO.atualizarCliente(cliente);
        return ClienteResponse.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .limiteCredito(cliente.getLimiteCredito())
                .build();
    }
}
