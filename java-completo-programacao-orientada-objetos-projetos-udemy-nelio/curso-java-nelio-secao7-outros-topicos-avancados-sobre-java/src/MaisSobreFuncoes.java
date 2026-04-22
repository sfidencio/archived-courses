import java.util.Scanner;

/**
* Esta classe explora a utilizacao de funcoes,sem adentrar no significado da mesma no paradigma O.O
* @author  Sebastiao Fidencio
* @version 1.0
* @since   2022-01-07
*/
public class MaisSobreFuncoes {

	public static void main(String[] args) {
		/*
		 * Saber qual maior numero entre 3 valores.., aplicabilidade de funcoes, para
		 * quebrar responsabilidades, modularizacao e reuso.
		 */
		int a = 0, b = 0, c = 0, maiorNumero, maiorNumeroEntre2Apenas, menorNumero;

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o primeiro numero: ");
		a = sc.nextInt();
		System.out.print("Informe o segundo numero: ");
		b = sc.nextInt();
		System.out.print("Informe o terceiro numero: ");
		c = sc.nextInt();
		maiorNumero = obterMaiorNumero(a, b, c); // Get Higher number.
		maiorNumeroEntre2Apenas = Math.max(a, b);
		menorNumero = obterMenorNumero(a, b, c);
		imprimirMaiorNumero("Maior numero entre os 3, utilizando funcao desenvolvida: ", maiorNumero);
		imprimirMaiorNumero("Maior numero entre os 2, utilizando funcao Math.max do JAVA: ", maiorNumeroEntre2Apenas);
		imprimirMaiorNumero("Menor numero entre os 3, utilizando funcao desenvolvida: ", menorNumero);

	}

	private static void imprimirMaiorNumero(String mensagem, int maiorNumero) {
		System.out.println(mensagem + " " + maiorNumero);
	}

	/*
	 * As variaveis da assinatura da funcao nao precisam ser identicas as da
	 * chamada, devem obedecer o tipo e a ordem respectiva onde, n1->a, n2->b, n3->c
	 */
	private static int obterMaiorNumero(int n1, int n2, int n3) {
		int aux = 0;
		if (n1 > n2 && n1 > n3) {
			aux = n1;
		} else if (n2 > n1 && n2 > n3) {
			aux = n2;
		} else {
			aux = n3;
		}
		return aux;
	}

	private static int obterMenorNumero(int n1, int n2, int n3) {
		int aux = 0;
		if (n1 < n2 && n1 < n3) {
			aux = n1;
		} else if (n2 < n1 && n2 < n3) {
			aux = n2;
		} else {
			aux = n3;
		}
		return aux;
	}

}
