import java.util.Scanner;

public class EstruturaControleIfElseExemploEncadeamentoIfs {

	public static void main(String[] args) {
		//Respeita Endentação de Codigo.
		
		Scanner sc = new Scanner(System.in);
		int hora = 0;
		System.out.println("Quantas horas? ");
		hora = sc.nextInt();
		System.out.println("Hora selecionada: " + hora);
		// Estrutura condicional simples (controlando fluxo do algoritimo)
		if (hora >= 12 && hora <= 18)
			System.out.println("Boa tarde!");
		//Colocando o else, eu tenho estrutura condicional composta
		else if(hora <12 && hora >=0)
			System.out.println("Bom dia!");
		else {
			System.out.println("Boa noite!");
		}
		

		//Acima eu não utilizei encadeamento de if's..como seria isso?
		/*if(hora<12)
			System.out.println("Bom Dia!");
		else {
			if(hora>18) {
				System.out.println("Boa noite!");
			}else 
			{
				System.out.println("Boa tarde");
			}
		}*/
		
		

	}

}
