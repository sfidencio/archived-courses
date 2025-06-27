import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Substituir a virgula pt-br, separador de decimal pelo ponto us-en
		Locale.setDefault(Locale.US);

		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = pi . raio^2 Considere o valor de pi = 3.14159
		 * diametro = 2r
		 */

		double raio, area;
		final double pi = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do RAIO:  ");
		raio = sc.nextDouble();
		System.out.println("RESULTADO: ");
		area = pi * Math.pow(raio, 2);
		//System.out.println("Valor da Area do Circulo e: " + area);
		System.out.printf("Valor da Area do Circulo e: %.4f%n ", area);
	}

}
