import java.util.regex.Pattern;

/**
 * @author  Sebastiao Fidencio
 * https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 * https://www.javatpoint.com/java-regex
 * */

public class PraticalRegex {

	public static void main(String[] args) {
		System.out.println("1º => " + Pattern.matches("a.", "ad"));	//primeiro char tem que ser a
		System.out.println("2º => "+Pattern.matches(".", "a"));	//qualquer caracter
		System.out.println("3º => "+Pattern.matches("...x", "a19x"));	// - 4º caracter tem que ser x
		System.out.println("4º => "+Pattern.matches("...x", "a19x"));	// - 4º caracter NAO tem que ser x
		System.out.println("5º => "+Pattern.matches("...[^x]", "a19x"));	// - 4º caracter NAO tem que ser x
		System.out.println("6º => "+Pattern.matches("[abc]..x", "a19x"));	// - Primeiro pode ser a, b ou c, o 2º e 3º qualquer um, e 4º deve ser x 
		System.out.println("7º => "+Pattern.matches("[5-8]", "7"));	// -  
		System.out.println("8º => "+Pattern.matches("(\\+|\\-)?[1-9]", "-9"));	// - ?=> indica que a posicao é opcional => (\\+|\\-) escapa o sinal de - e + para ser utilizado, pois e caracter especial no regex
		//App - {0,6} => 7 caracteres / deixa sinal de menos ou mais opcional=> ^\\-?
		System.out.println("9º => "+Pattern.matches("((^\\-?[1-9]{1}[0-9]{0,6})?||[0]{1})","-1234567"));
		
		
	}

}
