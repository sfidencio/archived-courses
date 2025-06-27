
public class CalculadoraFixa {

	public static void main(String[] args) {
		// Calcular array de numeros passado por parametro para o objeto calculadora
		CalculadoraService calculadora = new CalculadoraService();
		double[] numeros = { 1.78, 2.78, 4.89 };
		System.out.println("Soma total: " + calculadora.somar(numeros));
	}

}

