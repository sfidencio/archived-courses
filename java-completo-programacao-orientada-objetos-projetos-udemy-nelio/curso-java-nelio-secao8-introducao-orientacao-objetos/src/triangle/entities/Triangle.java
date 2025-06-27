package triangle.entities;

/**
 * Entidade Triangulo.
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class Triangle {
	/*
	 * Observe abaixo que criei os atributos com modificador de acesso
	 * privado,encapsulando-os, e foi gerado os acessores getters e setters para
	 * cada field(Campo).
	 */
	private double a;
	private double b;
	private double c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	/*
	 * Transferimos a responsabilidade de calcular a area para classe Triangle. (Principio da Responsabilidad Unica[Single Responsability Principle) - Coesao) 
	 */
	public double calcularArea() {
		double p = (getA() + getC() + getC()) / 2.0;
		return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
	}

}
