package br.com.sfidencio.estoque.estoqueapi.domain.dao;

import br.com.sfidencio.estoque.estoqueapi.domain.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ClienteDAO {
    //@PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public ClienteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Cliente> obterTodosClientes() {
        //TypeQuery<Cliente> query...
        return this.entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }

    public Cliente obterCliente(Long id) {
        return this.entityManager.find(Cliente.class, id);
    }

    @Transactional
    public Cliente cadastrarCliente(Cliente cliente) {
        this.entityManager.persist(cliente);
        return cliente;
        //Se quisesse retornar so fazer return cliente...(objeto sincronizado)
    }

    @Transactional
    public Cliente atualizarCliente(Cliente cliente) {
        this.entityManager.merge(cliente);
        return cliente;
    }
}
