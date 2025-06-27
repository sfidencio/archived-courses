import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploOperadoraTelefonia {

	public static void main(String[] args) {
		/*
		 * Problema exemplo Uma operadora de telefonia cobra R$ 50.00 por um plano
		 * básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a
		 * franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser
		 * pago.
		 */
		Locale.setDefault(Locale.US);
		int consumoEmMinutos = 0;
		double valorMinutoExcedente = 2.00d;
		double totalMaisExcedente = 0d;
		double valorFixoConta = 50.0d;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com qtde de minutos consumida: ");
		consumoEmMinutos = sc.nextInt();
		
		
		
		if (consumoEmMinutos <= 100) {
			System.out.println("Valor à pagar: R$ 50,00");
		} else {
			//totalMaisExcedente = 50 + (Math.abs(consumoEmMinutos - 100) * 2);
			
			// System.out.println("Valor à pagar: R$ " + totalMaisExcedente);
			valorFixoConta  += Math.abs(consumoEmMinutos-100)*2;
			//System.out.printf("Valor à pagar: R$ %.2f%n ", totalMaisExcedente);
			System.out.printf("Valor à pagar: R$ %.2f%n ", valorFixoConta);
		}

		sc.close();
	}

}
