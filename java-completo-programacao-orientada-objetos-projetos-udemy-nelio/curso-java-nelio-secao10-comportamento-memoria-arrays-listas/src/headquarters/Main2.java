package headquarters;

import java.util.Scanner;
/**
 * @author Sebastiao Fidencio
 * 
 *  Matriz
 * 
 *Fazer um programa para ler dois números inteiros M e N, e depois ler
 *uma matriz de M linhas por N colunas contendo números inteiros,
 *podendo haver repetições. Em seguida, ler um número inteiro X que
 *pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 *esquerda, acima, à direita e abaixo de X, quando houver, conforme
 *exemplo.
 *
 *Esta matriz nessariamente nao e quadrada
 *
 *Exemplo de uso:
 *
 *Enter with quantity M: 3
 *Enter with quantity N: 3
 *Informe numbers mtx: 
 *1 10 -2
 *4 -2 50
 *18 30 4
 *Informe number x: -2
 *Position 0,2:
 *Left: 10
 *Down: 50
 *Position 1,1:
 *Left: 4
 *Up: 10
 *Right: 50
 *Down: 30
 * 
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter with quantity M: ");
		int m = sc.nextInt();
		System.out.print("Enter with quantity N: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println("Informe numbers mtx: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Informe number x: ");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
