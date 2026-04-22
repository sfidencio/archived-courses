import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		char sexo = 'M';
		String descricaoSexo = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o Sexo da Pessoa: ");
		sexo = sc.next().charAt(0); // Obtem um char na posicao 0 da cadeia de caracters.

		//Aplicabilidade do operador ternário
		descricaoSexo = sexo == 'F' ? "FEMININO" : "MASCULINO";

		switch (sexo) {
		case 'M':
			System.out.println("Opcao selecionada: " + sexo + " - " + descricaoSexo);
			break;
		case 'F':
			System.out.println("Opcao selecionada: " + sexo + " - " + descricaoSexo);
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}

	}

}
