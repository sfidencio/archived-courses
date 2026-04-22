import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão
		 * 64bits: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		double a, b, c, triangle_rectangle_area, circle_area, trapeze_area, square_area, rectangle_area;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter with value A: ");
		a = sc.nextDouble();
		System.out.println("Enter with value B: ");
		b = sc.nextDouble();
		System.out.println("Enter with value C: ");
		c = sc.nextDouble();
		triangle_rectangle_area = (a * c) / 2;
		System.out.printf("Area of Triangle Rectangle: %.3f%n", triangle_rectangle_area);
		circle_area = 3.14159 * Math.pow(c, 2);
		System.out.printf("Area of circle: %.3f%n", circle_area);
		trapeze_area = ((a + b) * c) / 2;
		System.out.printf("Area of Trapeze: %.3f%n", trapeze_area); // trapezio
		square_area = b * b;
		System.out.printf("Area of Square: %.3f%n", square_area); // quadrado
		rectangle_area = a * b;
		System.out.printf("Area of Rectangle: %.3f%n", rectangle_area);// retangulo

	}

}
