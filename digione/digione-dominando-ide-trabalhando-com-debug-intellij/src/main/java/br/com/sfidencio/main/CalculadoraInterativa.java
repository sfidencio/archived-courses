package br.com.sfidencio.main;

import br.com.sfidencio.service.implementation.CalculadoraService;

import java.util.Scanner;

public class CalculadoraInterativa {

	public static void main(String[] args) {
		//Realizar tratamento de excecao, usuario pode informar dados incompativeis.
		try {
			CalculadoraService calculadoraService = new CalculadoraService();
			Scanner scan = new Scanner(System.in);
			double a, b;
			System.out.print("Digite o primeiro valor: ");
			a = scan.nextDouble();
			System.out.print("Digite o segundo valor: ");
			b = scan.nextDouble();
			double[] numeros = { a, b };
			System.out.println(calculadoraService.somarListaNumeros(numeros));
		} catch (Exception e) {
			System.out.println("Erro de conversao de dados. Informe numeros inteiros ou fracionados separados por virgula!");
		}

	}


}
