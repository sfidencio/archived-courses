import java.util.Scanner;

public class EntradaDados_27_parte1 {

	public static void main(String[] args) {
		
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa: ");
		nome = sc.next();
		// System.out.println(nome);

		int idade = 0;
		System.out.println("Digite a idade da pessoa: ");
		idade = sc.nextInt();
		// System.out.println("Idade da pessoa:\nNome: " + nome + "\nIdade: " + idade);

		double limiteCredito = 0.0d;
		System.out.println("Digite o limite de credito da pessoa: ");
		limiteCredito = sc.nextDouble();
		// System.out.println("Informe limite de credito da pessoa:\nNome: " + nome +
		// "\nLimite: " + limiteCredito);

		System.out.println("Resultado:\n\nNome: " + nome + "\nIdade: " + idade + "\nLimite de Credito: " + limiteCredito);
		sc.close();// Encerra o recurso

	}

}
