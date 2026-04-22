package br.com.alura;

public class Calculo {
	public int somarNumeros(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++)
			soma += numeros[i];
		return soma;
	}
}
