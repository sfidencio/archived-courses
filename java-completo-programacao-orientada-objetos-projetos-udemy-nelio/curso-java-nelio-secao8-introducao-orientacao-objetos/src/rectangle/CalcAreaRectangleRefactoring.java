package rectangle;


import java.util.Locale;
import java.util.Scanner;

import rectangle.entities.Rectangle;

/**
 * Calcula area,perimetro e diagonal de uma retangulo
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class CalcAreaRectangleRefactoring {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle(); // Declarando depedencia
		System.out.print("Enter the measures of rectangle X => [WIDTH]: ");
		x.setWidth(sc.nextDouble());
		System.out.print("Enter the measures of rectangle X => [HEIGHT]: ");
		x.setHeight(sc.nextDouble());

		System.out.println("Area of Rectangle: " + x.calculeArea());
		System.out.println("Perimeter of Rectangle: " + x.calculePerimeter());
		System.out.println("Diagonal of Rectangle: " + x.calculeDiagonal());

		sc.close();
	}

}
