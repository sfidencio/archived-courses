package dollarexchangerate;

import java.util.Scanner;

import dollarexchangerate.entities.CurrecyConverter;

/**
 * Ler a cotacao dolar, depois um valor em dolares a ser comprado por uma pessoa
 * em reais. Informar quantos reais a pessoa vai pagar por dolar, considerando
 * que a pessoa terá um IOF de 6%.
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-09
 */
public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			CurrecyConverter cc = new CurrecyConverter();
			System.out.println("****DollarsToReais****");
			System.out.print("What is dollar price?=> ");
			cc.setDollarPrice(sc.nextDouble());
			System.out.print("How many dollars will be bought?=> ");
			cc.setQuantityDollarsToBeBought(sc.nextDouble());
			System.out.printf("Amount to be paid in reais => $ %.2f%n ", cc.calculeDollarToReal());
			System.out.println("****DollarsToReais****");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
