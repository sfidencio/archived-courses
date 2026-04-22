package vetores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Sebastiao Fidencio
 * 		   Fazer um programa para ler um número inteiro N e a altura de
 *         N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
 *         altura média dessas pessoas.
 */
public class Height {
	public static void main(String[] args) {
		Scanner sc = null;
		// Locale.setDefault(Locale.US);
		try {
			sc = new Scanner(System.in);
			int n = 0;
			double[] vectorHeights;

			System.out.print("Inform the height of N people: ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Number <<N>> invalid");
				return;
			}
			vectorHeights = new double[n];
			for (int i = 0; i < vectorHeights.length; i++) {
				System.out.print("Inform the height number " + (i + 1) + "=> ");
				vectorHeights[i] = sc.nextDouble();
				if (vectorHeights[i] <= 0) {
					System.out.println("Height not reported correctly");
					i--;
				}
			}
			// Let's print now and calculate the average
			double sum = 0.0d, avg = 0.0d;
			for (int i = 0; i < vectorHeights.length; i++) {
				System.out.println(vectorHeights[i]);
				sum += vectorHeights[i];
			}
			avg = sum / n;
			
			System.out.printf("Sum of heights: %.2f ", sum);
			System.out.printf("Avg of heights: %.2f " , avg);
			/*System.out.println("Sum of heights: " + sum);
			System.out.println("Avg of heights: " + avg);*/
			
		} catch (InputMismatchException e) {
			System.out.println("Not is number or format incorrect!");
		} finally {
			sc.close();
		}
	}
}
