import java.util.Scanner;

public class EstruturaControleIfElseComposta {

	public static void main(String[] args) {
		
		/*Utilizar abertura e fechamento de chaves é opcional, quando se tem um único comando no bloco if/else**/
		
		Scanner sc = new Scanner(System.in);
		int hora = 0;
		System.out.println("Entre com a hora: ");
		hora = sc.nextInt();
		System.out.println("Hora selecionada: " + hora);
		// Estrutura condicional simples (controlando fluxo do algoritimo)
		if (hora > 12)
			System.out.println("Boa tarde!");
		//Colocando o else, eu tenho estrutura condicional composta
		else
			System.out.println("Bom dia!");
		
		
		

	}

}
