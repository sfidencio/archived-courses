package br.com.sfidencio.estoque.estoqueapi.domain.service;

import br.com.sfidencio.estoque.estoqueapi.domain.dao.MovimentacaoDAO;
import br.com.sfidencio.estoque.estoqueapi.domain.model.*;
import br.com.sfidencio.estoque.estoqueapi.exceptions.EstoqueInsuficienteException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class MovimentacaoServiceTest {

    @Mock
    private EntityManager entityManager;
    @Mock
    private MovimentacaoDAO movimentacaoDAO;

    @InjectMocks
    private MovimentacaoService movimentacaoService;

    @BeforeEach
    public void setUp() {
        this.movimentacaoService = new MovimentacaoService(this.movimentacaoDAO);
    }

    @Test
    public void deveria_realizar_entrada_produto_estoque() throws EstoqueInsuficienteException {
        var movimentacaoFake = simular_entrada_fake_sucesso();
        Mockito.when(movimentacaoDAO.incluirMovimentacao(Mockito.any()))
                .thenReturn(movimentacaoFake); //BDDMockito.any();
        var retorno = this.movimentacaoService.efetuarMovimentacao(movimentacaoFake);
        Assertions.assertEquals(1000, retorno.getId());
    }

    @Test
    public void deveria_nao_realizar_entrada_em_funcao_estoque_insuficiente() {
        var movimentacaoFake = simular_entrada_fake_estoque_insuficiente();
        try {
            this.movimentacaoService.efetuarMovimentacao(movimentacaoFake);
            Mockito.verifyNoInteractions(this.movimentacaoDAO);
        } catch (Exception ex) {

        }
    }

    @Test
    public void deveria_nao_realizar_entrada_em_funcao_estoque_insuficiente3() {
        var movimentacaoFake = simular_entrada_fake_estoque_insuficiente();
        Assertions.assertThrows(EstoqueInsuficienteException.class,
                () -> this.movimentacaoService.efetuarMovimentacao(movimentacaoFake));
        Mockito.verifyNoInteractions(this.movimentacaoDAO);
    }

    @Test
    public void deveria_nao_realizar_entrada_em_funcao_excecao_generica() {
        var movimentacaoFake = simular_entrada_fake_sucesso();
        Mockito.when(this.movimentacaoDAO.incluirMovimentacao(Mockito.any()))
                .thenThrow(RuntimeException.class);

        Assertions.assertThrows(Exception.class,
                () -> this.movimentacaoService.efetuarMovimentacao(movimentacaoFake));
    }

   /* @Test
    public void deveria_nao_realizar_entrada_em_funcao_estoque_insuficiente2() {
        var movimentacaoFake = simular_entrada_fake_estoque_insuficiente();
        //Assertions.assertThrows(EstoqueInsuficienteException.class, () -> this.movimentacaoService.efetuarMovimentacao(movimentacaoFake));
        try {
            this.movimentacaoService.efetuarMovimentacao2(movimentacaoFake);
            Mockito.verifyNoInteractions(this.movimentacaoDAO);
        }catch (Exception ex){

        }
        //Mockito.verifyNoInteractions(this.movimentacaoDAO);
        //Mockito.verify(this.movimentacaoDAO).incluirMovimentacao(Mockito.any());
    }*/

    @Test
    public void deveria_alterar_status_movimento_para_baixado() {
        var movimentacaoFake = simular_entrada_fake_sucesso();
        log.info("Antes: " + movimentacaoFake.getStatusMovimentacao().name());
        Mockito.when(this.movimentacaoDAO.baixarMovimentacao(Mockito.any()))
                .thenReturn(movimentacaoFake); //BDDMockito.any();
        var retorno = this.movimentacaoService.baixarMovimentacao(movimentacaoFake);
        Mockito.verify(this.movimentacaoDAO).baixarMovimentacao(movimentacaoFake);
        log.info("Depois: " + retorno.getStatusMovimentacao().name());
        Assertions.assertEquals(StatusMovimentacao.BAIXADA, retorno.getStatusMovimentacao());
    }


    private Movimentacao simular_entrada_fake_sucesso() {
        var movimentacao = new Movimentacao();
        movimentacao.setDataMovimento(LocalDate.now());
        var cliente = new Cliente();
        cliente.setId(1000L);
        cliente.setNome("Fulano");
        cliente.setLimiteCredito(new BigDecimal("2500"));
        movimentacao.setCliente(cliente);
        movimentacao.setStatusMovimentacao(StatusMovimentacao.PENDENTE);
        movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        var produto = new Produto();
        produto.setDescricao("Produto 1");
        produto.setPreco(new BigDecimal("2.20"));
        produto.setEstoque(new BigDecimal("4"));
        var item = new MovimentacaoItemDetalhe();
        item.setId(1000L);
        item.setPreco(produto.getPreco());
        item.setQuantidade(new BigDecimal("3"));
        item.setProduto(produto);
        movimentacao.adicionarItem(item);
        movimentacao.setId(1000L);
        return movimentacao;
    }

    private Movimentacao simular_entrada_fake_estoque_insuficiente() {
        var movimentacao = new Movimentacao();
        movimentacao.setDataMovimento(LocalDate.now());
        var cliente = new Cliente();
        cliente.setId(1000L);
        cliente.setNome("Fulano");
        cliente.setLimiteCredito(new BigDecimal("2500"));
        movimentacao.setCliente(cliente);
        movimentacao.setStatusMovimentacao(StatusMovimentacao.PENDENTE);
        movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
        var produto = new Produto();
        produto.setDescricao("Produto 1");
        produto.setPreco(new BigDecimal("2.20"));
        produto.setEstoque(new BigDecimal("4"));
        var item = new MovimentacaoItemDetalhe();
        item.setId(1000L);
        item.setPreco(produto.getPreco());
        item.setQuantidade(new BigDecimal("8"));
        item.setProduto(produto);
        movimentacao.adicionarItem(item);
        movimentacao.setId(1000L);
        return movimentacao;
    }
}
