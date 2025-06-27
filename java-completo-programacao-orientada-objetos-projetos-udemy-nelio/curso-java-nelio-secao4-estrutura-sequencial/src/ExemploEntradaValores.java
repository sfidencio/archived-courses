import java.util.Locale;
import java.util.Scanner;

public class ExemploEntradaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,z;
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com primeiro valor a ser calculado: ");
		x=scanner.nextDouble();
		System.out.println("Entre com segundo valor a ser calculado: ");
		y=scanner.nextDouble();
		
		//Pra utilizar argumentos igual na linguagem C, utlize o printf
		System.out.printf("Valores digitados: %f e %f",x,y);
		
		//Saltar L
		System.out.println("\r\n");
		
		//Caso queira utilizar o método estático println, que permite saltar linha \r\n, então faça assim
		System.out.println("Valores digitados: " + x + " e " + y);
		
		
	}

}
