import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDadosTratamentoExcecao_28 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			//Ajustando a virgula
			//Locale.setDefault(Locale.US); //Determinar que separador decimais seja ponto e nao virgula
			
			String nome;
			sc = new Scanner(System.in);
			System.out.println("Digite o nome da pessoa: Ex: Joao");
			nome = sc.next();

			int idade = 0;
			System.out.println("Digite a idade da pessoa: Ex: 55");
			idade = sc.nextInt();

			double limiteCredito = 0.0d;
			System.out.println("Digite o limite de credito da pessoa: Ex: 693,25");
			limiteCredito = sc.nextDouble();
			System.out.println(
					"Resultado:\n\nNome: " + nome + "\nIdade: " + idade + "\nLimite de Credito: " + limiteCredito);
			sc.close();// Encerra o recurso
		} catch (InputMismatchException e) {
			System.out.println("Erro de conversão de dados!");
		} finally {
			sc.close();
		}

	}

}
