
/**
 * Esta classe explora a utilizacao de funcoes utilitarias da classe String.
 * 
 * @author Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-07
 */
public class FuncoesString {

	public static void main(String[] args) {
		String original = " ABCD ijkLMN opq RST AjMN  uvxz 1234 ijk CD  ";

		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(6);
		String s5 = original.substring(6, 14);
		String s6 = original.replace('M', '$');
		String s7 = original.replace("CD", "))");
		int j = original.indexOf("jk");
		int k = original.lastIndexOf("jk");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase(): -" + s1 + "-"); // Converter para minusculo
		System.out.println("toUpperCase(): -" + s2 + "-"); // Converter para maiusculo
		System.out.println("trim(): -" + s3 + "-"); // Remover espacos a esquerda e direita, nas extremidades da String
		System.out.println("substring(6): -" + s4 + "-"); // Obtem a String ou corta apartir do Sexto Dígito.
		System.out.println("substring(6,14): -" + s5 + "-"); // Obtem a String ou corta apartir do Sexto Dígito ate
																// Decimo Quarto.
		System.out.println("replace('M','$'): -" + s6 + "-"); // Substituir caracter 'M' por '$'
		System.out.println("replace(\"CD\",\"))\"): -" + s7 + "-"); // Substituir caracter "CD" por "))"
		System.out.println("indexOf(\"jk\") :-" + j + "-"); // Obtem a posicao do pedaco de string passado por parametro
															// na primeira ocorrencia
		System.out.println("indexOf(\"jk\") :-" + k + "-"); // Obtem a posicao do pedaco de string passado por parametro
															// na ultima ocorrencia

	}

}
