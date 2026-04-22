package br.com.sfidencio.estoque.estoqueapi.domain.service;

import br.com.sfidencio.estoque.estoqueapi.domain.dao.ClienteDAO;
import br.com.sfidencio.estoque.estoqueapi.domain.model.Cliente;
import br.com.sfidencio.estoque.estoqueapi.request.ClienteRequest;
import br.com.sfidencio.estoque.estoqueapi.response.ClienteResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;

//@SpringBootTest
@ExtendWith(MockitoExtension.class) // -> alternativa -> @RunWith(MockitoJUnitRunner.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
class ClienteServiceTest {

    @Mock
    private ClienteDAO clienteDAO; // //ClienteDAO clienteDAO = Mockito.mock(ClienteDAO.class); <- substituido pela annotation

    @InjectMocks
    private ClienteService clienteService;

    @Captor
    private ArgumentCaptor<Cliente> cliente;


    @BeforeEach
    void setUp() {
        //MockitoAnnotations.initMocks(this); <- substituido por @ExtendWith(MockitoExtension.class)
        this.clienteService = new ClienteService(this.clienteDAO);
    }

    @Test
    public void deveria_cadastrar_cliente_novo() {
        var clienteMock = this.simularCadastroFake();
        var req = new ClienteRequest("Fulano", new BigDecimal("2500"));
        Mockito.when(this.clienteDAO.cadastrarCliente(BDDMockito.any())) //BDDMockito.any() - Mockito.any()
                .thenReturn(clienteMock);
        ClienteResponse response = this.clienteService.cadastrar(req);
        //verify() checa se determinado metodo do mock foi chamado!
        Mockito.verify(clienteDAO).cadastrarCliente(BDDMockito.any());
        Assertions.assertNotNull(response.getId());
    }

    @Test
    public void deveria_cadastrar_cliente_novo_capturar_parametro_passado() {
        var clienteMock = this.simularCadastroFake();
        var req = new ClienteRequest("Fulano", new BigDecimal("2500"));
        Mockito.when(this.clienteDAO.cadastrarCliente(BDDMockito.any())) //BDDMockito.any() - Mockito.any()
                .thenReturn(clienteMock);
        ClienteResponse response = this.clienteService.cadastrar(req);
        //verify() checa se determinado metodo do mock foi chamado!
        Mockito.verify(clienteDAO).cadastrarCliente(cliente.capture());
        Assertions.assertNotNull(response.getId());

        //Capturando parametro passado no metodo do mock
        Cliente clienteCapturado = cliente.getValue();
        Assertions.assertNotNull(clienteCapturado);

    }


    @Test
    public void deveria_atualizar_cliente_existente() throws Exception {
        var clienteMock = this.simularCadastroFake();
        Mockito.when(this.clienteDAO.obterCliente(Mockito.any()))
                .thenReturn(clienteMock);
        var retornoConsuta = this.clienteService.consultar(Mockito.any());
        Assertions.assertNotNull(retornoConsuta);
        retornoConsuta.setNome("Cliente Mocado - Alterado");
        Mockito.when(this.clienteDAO.atualizarCliente(Mockito.any()))
                .thenReturn(new Cliente(retornoConsuta.getId(), retornoConsuta.getNome(), retornoConsuta.getLimiteCredito(), new ArrayList<>()));
        var retornoAtualizado = this.clienteService.atualizar(retornoConsuta);
        Mockito.verify(this.clienteDAO).atualizarCliente(Mockito.any());
        Assertions.assertEquals("Cliente Mocado - Alterado", retornoAtualizado.getNome());
    }

    private Cliente simularCadastroFake() {
        var cliente = new Cliente();
        cliente.setId(1000L);
        cliente.setNome("Cliente Mocado");
        cliente.setLimiteCredito(new BigDecimal("42500.25"));
        return cliente;
    }

}