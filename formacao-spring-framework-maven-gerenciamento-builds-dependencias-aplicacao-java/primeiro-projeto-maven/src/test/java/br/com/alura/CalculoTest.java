package br.com.alura;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculoTest {

	@Test
	public void testSomarNumerosResultadoCorreto() {
		Calculo calculo = new Calculo();
		double resultado = calculo.somarNumeros(new int[] { 5, 10, 22 });
		System.out.println(resultado);
		assertTrue(resultado == 37);
	}

	@Test
	public void testSomarNumerosResultadoErrado() {
		Calculo calculo = new Calculo();
		double resultado = calculo.somarNumeros(new int[] { 5, 10, 22, 98 });
		System.out.println(resultado);
		assertFalse(resultado == 37);
	}

}
