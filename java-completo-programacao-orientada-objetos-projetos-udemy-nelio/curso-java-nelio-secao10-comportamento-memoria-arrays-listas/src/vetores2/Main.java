package vetores2;

import java.util.InputMismatchException;
import java.util.Scanner;

import vetores2.entity.Product;

/**
 * @author Sebastiao Fidencio
 *         Fazer um programa para ler um número inteiro N e os dados
 *         (nome e preço) de N Produtos. Armazene os N produtos em um vetor. Em
 *         seguida, mostrar o preço médio dos produtos.
 *         Observe que neste exemplo, utilizaremos ainda Vetor, que é um array
 *         unidimensioanal com tamanho fixo, porém, com tipo composto, uma
 *         classe com atributos.(datatypes diferentes)
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		Product[] vectorProducts = null;
		int code = 0;
		String description;
		double price = 0.0d;
		// Locale.setDefault(Locale.US);
		try {
			sc = new Scanner(System.in);
			int n = 0;
			System.out.print("Inform quantity of products: ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Number <<N>> invalid");
				return;
			}
			vectorProducts = new Product[n];
			for (int i = 0; i < vectorProducts.length; i++) {
				System.out.print("Inform the [CODE] product " + (i + 1) + "=> ");
				code = sc.nextInt();
				System.out.print("Inform the [DESCRIPTION] product " + (i + 1) + "=> ");
				description = sc.next();
				System.out.print("Inform the [PRICE] product " + (i + 1) + "=> ");
				price = sc.nextDouble();
				vectorProducts[i] = new Product(code, description, price);
			}
			// Calcule Avarage
			double sum = 0.0d;
			double avg = 0.0d;
			for (int i = 0; i < vectorProducts.length; i++) {
				sum += vectorProducts[i].getPrice();
			}
			avg = sum / vectorProducts.length;
			System.out.printf("AVERAGE PRICE: %.2f", avg);
		} catch (InputMismatchException e) {
			System.out.println("Not is number or format incorrect!");
		} finally {
			sc.close();
		}
	}

}
