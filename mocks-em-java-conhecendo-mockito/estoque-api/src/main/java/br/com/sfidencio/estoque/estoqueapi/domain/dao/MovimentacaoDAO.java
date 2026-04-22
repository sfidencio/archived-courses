package br.com.sfidencio.estoque.estoqueapi.domain.dao;

import br.com.sfidencio.estoque.estoqueapi.domain.model.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class MovimentacaoDAO {

    private EntityManager entityManager;

    @Autowired
    public MovimentacaoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Movimentacao incluirMovimentacao(Movimentacao movimentacao) {
        this.entityManager.persist(movimentacao);
        return movimentacao;
    }

    @Transactional
    public Movimentacao baixarMovimentacao(Movimentacao movimentacao) {
        this.entityManager.persist(movimentacao);
        return movimentacao;
    }

}
