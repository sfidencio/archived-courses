package br.com.sfidencio.estoque.estoqueapi.domain.service;

import br.com.sfidencio.estoque.estoqueapi.domain.dao.MovimentacaoDAO;
import br.com.sfidencio.estoque.estoqueapi.domain.model.Movimentacao;
import br.com.sfidencio.estoque.estoqueapi.domain.model.MovimentacaoItemDetalhe;
import br.com.sfidencio.estoque.estoqueapi.domain.model.StatusMovimentacao;
import br.com.sfidencio.estoque.estoqueapi.exceptions.EstoqueInsuficienteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService {
    private MovimentacaoDAO movimentacaoDAO;

    @Autowired
    public MovimentacaoService(MovimentacaoDAO movimentacaoDAO) {
        this.movimentacaoDAO = movimentacaoDAO;
    }

    public Movimentacao efetuarMovimentacao(Movimentacao movimentacao) throws EstoqueInsuficienteException {
        for (MovimentacaoItemDetalhe item : movimentacao.getItens()) {
            if (item.getQuantidade().doubleValue() > item.getProduto().getEstoque().doubleValue()) {
                throw new EstoqueInsuficienteException("Estoque insuficiente!");
            }
        }
        return this.movimentacaoDAO.incluirMovimentacao(movimentacao);
    }

    public Movimentacao efetuarMovimentacao2(Movimentacao movimentacao) throws EstoqueInsuficienteException {
       /* for (MovimentacaoItemDetalhe item : movimentacao.getItens()) {
            if (item.getQuantidade().doubleValue() > item.getProduto().getEstoque().doubleValue()) {
                throw new EstoqueInsuficienteException("Estoque insuficiente!");
            }
        }*/
        return this.movimentacaoDAO.incluirMovimentacao(movimentacao);
    }

    public Movimentacao baixarMovimentacao(Movimentacao movimentacao) {
        movimentacao.setStatusMovimentacao(StatusMovimentacao.BAIXADA);
        return this.movimentacaoDAO.baixarMovimentacao(movimentacao);
    }

}
