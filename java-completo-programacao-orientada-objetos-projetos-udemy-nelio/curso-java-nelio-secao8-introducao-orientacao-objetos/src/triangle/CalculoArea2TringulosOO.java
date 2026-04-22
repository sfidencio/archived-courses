package triangle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Calcula area de 2 triangulos com uso de orientacao objetos. Projeto
 * refatorado
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class CalculoArea2TringulosOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y; // Declarando depedencia - E uma variavel Composta por 3 atributos criadas por nós.
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		System.out.println("Enter the measures of triangle Y: ");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		double p = (x.getA() + x.getC() + x.getC()) / 2.0;
		double areaX = Math.sqrt(p * (p - x.getA()) * (p - x.getB()) * (p - x.getC()));
		p = (y.getA() + y.getB() + y.getC()) / 2.0;
		double areaY = Math.sqrt(p * (p - y.getA()) * (p - y.getB()) * (p - y.getC()));
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY)
			System.out.println("Larger area X => (using O.O)");
		else
			System.out.println("Larger area Y  => (using O.O)");
		sc.close();
	}

}
