package triangle;
import java.util.Locale;
import java.util.Scanner;



/**
 * Calcula area de 2 triangulos com uso de orientacao objetos. Projeto
 * refatorado - iremos mover a funcao de calcular area para a classe triangulo,
 * pois trata-se de uma operacao da classe Triangle.
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class CalculoArea2TringulosOORef {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y; // Declarando depedencia - E uma variavel Composta por 3 atributos criadas por nos
		double areaX, areaY;
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

		areaX = x.calcularArea();
		areaY = y.calcularArea();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY)
			System.out.println("Larger area X => (using O.O)");
		else
			System.out.println("Larger area Y  => (using O.O)");
		sc.close();
	}

}
