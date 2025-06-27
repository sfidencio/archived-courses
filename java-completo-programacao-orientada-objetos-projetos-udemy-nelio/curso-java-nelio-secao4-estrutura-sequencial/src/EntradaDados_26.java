import java.util.Locale;
import java.util.Scanner;

public class EntradaDados_26 {

	public static void main(String[] args) {
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa: ");
		nome = sc.next();
		System.out.println("Voce digitou: " + nome);

		//Aqui vai pegar com virgula, portugues brasil
		double limiteCredito = 0d;
		System.out.println("Digite o limite de credito do cliente: ");
		limiteCredito = sc.nextDouble();
		
		System.out.println("Valor digitado <<println pega localidade independente, por isso aparece o ponto.>> : " + limiteCredito);
		System.out.printf("Valor digitado <<printf pega de acordo com locale>>: %.2f%n", limiteCredito);
		
		//Aqui vai pegar sem virgula..ingles USA
		Locale.setDefault(Locale.US);
		System.out.println("Aplicando agora o locale...");
		System.out.println("Digite o limite de credito do cliente(locale): ");
		limiteCredito = sc.nextDouble();
		System.out.println("Valor digitado <<println pega localidade independente, por isso aparece o ponto.>> : " + limiteCredito);
		System.out.printf("Valor digitado <<printf pega de acordo com locale>>: %.2f%n", limiteCredito);
		
	
		System.out.println("Trabalhando com <<char>>, observe que vai pegar um lentra apenas, pois charAt pega indice");
		System.out.println("Digite a letra: ");
		
		char x1;
		x1 = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x1);
		
		
		
		System.out.println("Leitura dados mesma linha separado espacos");
		
		   /*Resultado*/
		   /*Digite a letra: 
			6
			Voce digitou: 6
			Leitura dados mesma linha separado espacos
			10 Amor 23,55
			10
			Amor
			23.55
		 	*/
		
		//Leitura dados mesma linha separado espacos
		int a1;
		String a2;
		double a3;
		
		a1 = sc.nextInt();
		a2 = sc.next();
		a3 = sc.nextDouble();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		

		sc.close();

	}

}
