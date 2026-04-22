package br.com.sfidencio.curso.teste.automatizados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BonusServiceTest {
    @Test
    public void deveria_retornar_bonus_calculado_maior_que_zero() {
        Funcionario funcionario = new Funcionario("Fulano", new BigDecimal("2900"));
        BonusService bonusService = new BonusService();
        BigDecimal resultadoBonus = bonusService.calcularBonus(funcionario);
        Assertions.assertEquals(290.00, resultadoBonus.doubleValue(), 0);
    }


    //Essa outra forma de testar Exception
    //Outra forma e usar try catch no teste
    //Ou utilizar assertThrows
    /*@Test(expected = IllegalArgumentException.class)
    public void deveria_retornar_bonus_calculado_igual_que_zero() {
        Funcionario funcionario = new Funcionario("Fulano", new BigDecimal("29000"));
        BonusService bonusService = new BonusService();
        bonusService.calcularBonus(funcionario);
    }*/


    @Test
    public void deveria_retornar_bonus_calculado_igual_que_zero() {
        Funcionario funcionario = new Funcionario("Fulano", new BigDecimal("29000"));
        BonusService bonusService = new BonusService();
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> bonusService.calcularBonus(funcionario));
    }


    /*
    //Desta forma capturamos a mensagem de erro da Exception
    @Test
    public void deveria_retornar_bonus_calculado_igual_que_zero() {
        Funcionario funcionario = new Funcionario("Fulano", new BigDecimal("29000"));
        BonusService bonusService = new BonusService();
        try {
            bonusService.calcularBonus(funcionario);
            fail("Nao deu a exception");
        } catch (Exception e) {
            Assert.assertEquals("Funcionario nao pode receber bonus!",e.getMessage());
        }
    }
    */
}
