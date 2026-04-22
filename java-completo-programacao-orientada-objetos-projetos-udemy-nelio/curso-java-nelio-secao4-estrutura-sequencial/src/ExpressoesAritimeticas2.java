import java.util.Locale;

public class ExpressoesAritimeticas2 {
	public static void main(String[] args) {
		int y;
		Locale.setDefault(Locale.US);
		y = 4 + 5 * 2; // ==>14
		System.out.println("Expressao => 4 + 5 * 2  e: " + y);
		y = (4 + 5) * 2; // ==>18
		// Abaixo, observe a mesma expressao com parenteses, o mesmo serve para quebra a
		// precedencia., assim a soma sera feita de
		// forma isolada.
		System.out.println("Expressao => (4 + 5) * 2  e: " + y);

		y = 60 / (3 + 2) * 4;
		System.out.println("Expressao => 60 / (3 + 2) * 4  e: " + y);

		y = 60 / 3 + 2 * 4;
		System.out.println("Expressao => 60 / 3 + 2 * 4  e: " + y);
		
		
		y = (10 % 3) + 2 * 4;
		System.out.println("Expressao => (10 % 3) + 2 * 4  e: " + y);
		

		// Na programação nao utilizamos chaves,parenteses e colchetes igual
		// escola,..encademos varios
		// niveis de parenteses que forem necessarios.
		// Sempre sera feito o calculo do parenses mais interno para o mais externo.
		// Estou utilizando o tipo double, pois o resultado podera vir fracionado, ou
		// seja, numero real.
		double result = 0d;
		result=10.0/4.3;
		System.out.println(String.format("%.5f",result));

	}
}
