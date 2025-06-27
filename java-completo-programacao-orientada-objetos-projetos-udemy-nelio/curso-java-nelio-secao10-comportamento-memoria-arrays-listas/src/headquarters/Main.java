package headquarters;

import java.util.Scanner;

public class Main {
	/**
	 * @author Sebastiao Fidencio
	 * 
	 *  	   Matriz
	 * 
	 *         Checklist
	 *
	 *         Revisão do conceito de matriz Declaração e instanciação Acesso aos
	 *         elementos / como percorrer uma matriz Propriedade length
	 * 
	 *         5,3,10 15 8,2 7,9,-4
	 * 
	 *         Matrizes Em programação, "matriz" é o nome dado a arranjos
	 *         bidimensionais Atenção: "vetor de vetores" Arranjo (array) é uma
	 *         estrutura de dados: • Homogênea (dados do mesmo tipo) Ordenada
	 *         (elementos acessados por meio de posições) Alocada de uma vez só, em
	 *         um bloco contíguo de memória Vantagens: Acesso imediato aos elementos
	 *         pela sua posição Desvantagens: Tamanho fixo Dificuldade para se
	 *         realizar inserções e deleções
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int[][] coordinate = new int[][] { { 5, 3, 10 }, { 15, 8, 2 }, { 7, 9, -4 }
		System.out.print("Enter quantity numbers: ");
		int quantity = sc.nextInt();
		int[][] coordinate = new int[quantity][quantity];

		System.out.println("");
		System.out.println("Read numbers: ");
		for (int y = 0; y < coordinate.length; y++) {
			for (int x = 0; x < coordinate[y].length; x++) {
				System.out.print("Enter with number position: ");
				coordinate[y][x] = sc.nextInt();
			}
		}
		System.out.println("Main Diagonal: ");
		for (int y = 0; y < coordinate.length; y++) {
			// for(int x=0;x<)
			System.out.print(coordinate[y][y] + " ");
		}
		System.out.println("");
		System.out.println("Negative Numbers: ");
		for (int y = 0; y < coordinate.length; y++) {
			for (int x = 0; x < coordinate[y].length; x++) {
				if (coordinate[y][x] < 0) {
					System.out.print(coordinate[y][x]);
				}
			}
		}
		
		System.out.println("");
		System.out.println("Print numbers: ");
		for (int y = 0; y < coordinate.length; y++) {
			for (int x = 0; x < coordinate[y].length; x++) {
				System.out.print("Enter with number position: ");
				coordinate[y][x] = sc.nextInt();
			}
		}
	}

}
