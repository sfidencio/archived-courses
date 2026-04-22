package br.com.sfidencio.curso.teste.automatizados;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

public class ReajusteTest {


    /*
     * Cuidado, os metodos privados das classes nao precisam ser testados pelo Junit, apenas o metodos
     * publicos, uma vez testados o metodos publicos, por consequencias, seus respectivos metodos privados
     * também estarao sendo testados.
     */

    private Funcionario funcionario;
    private ReajusteService reajusteService;

    @BeforeEach
    public void inicializar() {
        this.funcionario = new Funcionario("Fulano", new BigDecimal("2500.00"));
        this.reajusteService = new ReajusteService();
    }

    @AfterEach
    public void fim() {
        System.out.println("Finalizado!");
    }


    @AfterAll
    public static void rodar_depois_todos() {
        System.out.println("Rodar depois de todos");
    }


    @BeforeAll
    public static void rodar_antes_todos() {
        System.out.println("Rodar antes de todos");
    }

    @Test
    @DisplayName(value = "Deveria Reajustar o Salário do Funcionario com Péssimo Desempenho")
    public void deveria_reajustar_salario_funcionario_cenario_pessimo() {
        reajusteService.concederReajuste(funcionario, Desempenho.PESSIMO);
        Assertions.assertEquals(new BigDecimal("2750.00"), funcionario.getSalario());
    }

    @Test
    public void deveria_reajustar_salario_funcionario_cenario_bom() {
        reajusteService.concederReajuste(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("3000.00"), funcionario.getSalario());
    }

    @Test
    public void deveria_reajustar_salario_funcionario_cenario_otimo() {
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("3250.00"), funcionario.getSalario());
    }

    /*@Test(expected  = IllegalArgumentException.class)
    public void deveria_nao_reajustar_salario_funcionario_quando_cenario_salario_acima_de_5000() {
        this.funcionario = new Funcionario("Fulano", new BigDecimal("10200.00"));
        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveria_nao_reajustar_salario_funcionario_quando_o_mesmo_for_inutil() {
        this.funcionario = new Funcionario("Fulano", new BigDecimal("4500.00"));
        this.reajusteService = new ReajusteService();
        reajusteService.concederReajuste(funcionario, Desempenho.INUTIL);
    }*/

    @Test
    public void deveria_nao_reajustar_salario_funcionario_quando_o_mesmo_for_inutil() {
        this.funcionario = new Funcionario("Fulano", new BigDecimal("4500.00"));
        this.reajusteService = new ReajusteService();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> reajusteService.concederReajuste(funcionario, Desempenho.INUTIL));

    }

    @Test
    public void deveria_nao_reajustar_salario_funcionario_quando_cenario_salario_acima_de_5000() {
        this.funcionario = new Funcionario("Fulano", new BigDecimal("10200.00"));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> reajusteService.concederReajuste(funcionario, Desempenho.OTIMO));
    }
}
