import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		  código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		int code = 0;
		double unitPrice = 0d;
		double quantity = 0d;
		double total = 0d;
		int control = 0;

		// Sistema que inicializa cadastro de peças e permite fazer venda de peças
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter with code part: ");
			code = sc.nextInt();
			System.out.println("Enter with unit price: ");
			unitPrice = sc.nextDouble();
			System.out.println("Enter with quantity: ");
			quantity = sc.nextDouble();
			// Calc

			total += quantity * unitPrice;

			System.out.println("Keep Selling? [0-No, 1-Yes]"); // Continua vendendo?
			control = sc.nextInt();
			if (control == 0)
				break;

		}

		System.out.println("AMOUNT TO PAY:  "); //Valor a pagar
		System.out.printf("Total: $USD %.2f%n " , total);

	}

}
