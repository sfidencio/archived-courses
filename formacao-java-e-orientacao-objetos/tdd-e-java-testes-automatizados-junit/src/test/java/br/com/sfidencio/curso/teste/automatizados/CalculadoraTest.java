package br.com.sfidencio.curso.teste.automatizados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void deveria_retornar_somar_corretamente_numeros_positivos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(10, 7);
        Assertions.assertEquals(17.0, resultado, 0);
    }

    @Test
    public void deveria_retornar_somar_incorretamente_numeros_positivos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(2, 5);
        Assertions.assertEquals(10, resultado, 0);
    }

    @Test
    public void deveria_retornar_multiplicacao_varios_numeros() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(2d, 3d, 6d, 9d);
        Assertions.assertEquals(324, resultado, 0);
    }
}
