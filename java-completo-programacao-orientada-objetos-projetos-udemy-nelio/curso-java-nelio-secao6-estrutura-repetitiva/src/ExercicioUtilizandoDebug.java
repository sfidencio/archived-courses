import java.util.Locale;
import java.util.Scanner;

public class ExercicioUtilizandoDebug {

	public static void main(String[] args) {
		double largura, comprimento, metroQuadrado,area,preco;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a largura: ");
		largura = sc.nextDouble();
		System.out.println("Informe a comprimento: ");
		comprimento = sc.nextDouble();
		System.out.println("Informe o preco do metro quadrado: ");
		metroQuadrado = sc.nextDouble();

		area = largura*comprimento;
		
		//System.out.println("Area Total: " + area);
		
		preco = area*metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
	}

}
