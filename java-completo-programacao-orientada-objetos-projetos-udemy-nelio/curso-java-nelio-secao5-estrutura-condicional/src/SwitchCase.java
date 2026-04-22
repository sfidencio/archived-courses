import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaSemana = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Selecione dia da semana: \n1-Domingo\n2-Segunda\n3-Terca\n4-Quarta\n5-Quinta\n6-Sexta\n7-Sabado");

		diaSemana = sc.nextInt();

		/*if (!(diaSemana >= 1) || !(diaSemana <= 7)) {
			System.out.println("Dia da semana selecionado incorreto!");
			return;
		}*/

		switch (diaSemana) {
		case 1:
			System.out.println("Dia selecionado: DOMINGO");
			break;
		case 2:
			System.out.println("Dia selecionado: SEGUNDA");
			break;
		case 3:
			System.out.println("Dia selecionado: TERCA");
			break;
		case 4:
			System.out.println("Dia selecionado: QUARTA");
			break;
		case 5:
			System.out.println("Dia selecionado: QUINTA");
			break;
		case 6:
			System.out.println("Dia selecionado: SEXTA");
			break;
		case 7:
			System.out.println("Dia selecionado: SABADO");
			break;
		default:
			System.out.println("Dia da semana selecionado incorreto!");

		}
		
		
		//poderia substituir o switch case por if/else-if/else, também funcionaria do mesmo jeito.
		sc.close();

	}

}
