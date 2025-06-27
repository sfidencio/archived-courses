import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int a, b, c, d, diferenca;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro numero: ");

		a = sc.nextInt();

		System.out.println("Informe o segundo numero: ");

		b = sc.nextInt();

		System.out.println("Informe o terceiro numero: ");

		c = sc.nextInt();

		System.out.println("Informe o quarto numero: ");

		d = sc.nextInt();
		
		System.out.println("RESULTADOS DA DIFERENCA DO PRODUTO: ");
		
		diferenca = (a*b) - (c*d);
		
		System.out.println(diferenca);
		
	}

}
