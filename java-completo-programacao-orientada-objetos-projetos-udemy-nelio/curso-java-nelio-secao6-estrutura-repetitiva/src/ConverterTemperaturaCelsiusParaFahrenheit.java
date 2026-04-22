import java.util.Locale;
import java.util.Scanner;

public class ConverterTemperaturaCelsiusParaFahrenheit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		char repetir = 'N';
		double tempC = 0.0d, tempF = 0.0d;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			tempC = sc.nextDouble();
			tempF = 9.0 * tempC / 5.0 + 32.0;
			System.out.printf("Temperatura em Fahrenheit: %.2f%n", tempF);
			System.out.print("Deseja repetir? (S/N): ");
			repetir = sc.next().toUpperCase().charAt(0);

		} while (repetir != 'N');

		System.out.println("**SISTEMA FINALIZADO**");
	}
}
