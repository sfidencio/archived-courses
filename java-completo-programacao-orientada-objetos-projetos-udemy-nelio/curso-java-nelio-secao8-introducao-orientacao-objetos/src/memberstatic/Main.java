package memberstatic;

import java.util.Scanner;

/**
 * Calcula cincunferencia, Volume
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = CalculatorGeometric.calculeCircumference(radius);
		double v = CalculatorGeometric.calculeVolumeSphere(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorGeometric.PI_VALUE);
	}

}
