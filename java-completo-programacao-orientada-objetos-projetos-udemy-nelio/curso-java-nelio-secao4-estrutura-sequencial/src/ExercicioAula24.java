import java.util.Locale;

public class ExercicioAula24 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Ebook";
		int age = 20;
		int code = 4478;
		char gender = 'F';
		double price1 = 24.99;
		double price2 = 2100.0;
		double measure = 53.998989;

		System.out.println("Products: ");
		System.out.printf("%s Which Price is: $%.2f%n", product1, price2);
		System.out.printf("%s Which Price is: $%.2f%n%n", product2, price1);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender); // inteiro: %d
		//Observe que ao inves de usar o println passando string vazia, apenas para quebrar linha, eu fiz no proprio printf usando %n
		System.out.printf("Measue with eigth decimal places: %f%n", measure); // inteiro: %f
		System.out.printf("Rouded (three decimal places): %.3f%n", measure); // inteiro: %f - arredondamento acima
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure); // inteiro: %f - arredondamento acima
		
	}

}
