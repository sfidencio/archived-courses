package vetores3;

import java.util.Scanner;

import vetores3.entity.Rent;

public class Main {
	/**
	 * @author Sebastiao Fidencio
	 * 	       A dona de um pensionato possui dez quartos para alugar para
	 *         estudantes, sendo esses quartos identificados pelos números 0 a 9.
	 *         Fazer um programa que inicie com todos os dez quartos vazios, e
	 *         depois leia uma quantidade N representando o número de estudantes que
	 *         vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o
	 *         aluguel dos N estudantes. Para cada registro de aluguel, informar o
	 *         nome e email do estudante, bem como qual dos quartos ele escolheu (de
	 *         0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu
	 *         programa deve imprimir um relatório de todas ocupações do pensionato,
	 *         por ordem de quarto, conforme exemplo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberRooms = 10;
		System.out.println("How many rooms will be rented/Quantos quartos serão alugados?");
		int quantityRoomsSelect = sc.nextInt();
		if (quantityRoomsSelect > numberRooms) {
			System.out.println("Number of rooms selected is greater than available");
			System.out.println("System finished!");
			System.exit(0);

		}
		Rent[] rooms = new Rent[numberRooms];
		for (int i = 1; i <= quantityRoomsSelect; i++) {
			Rent rent = new Rent();
			System.out.print("Please, inform code student: ");
			rent.setCode(sc.nextInt());
			System.out.print("Please, inform name student: ");
			rent.setName(sc.next());
			System.out.print("Please, inform email student: ");
			rent.setEmail(sc.next());
			System.out.println("Select room, please =>");
			int numberRoom = sc.nextInt();
			if (numberRoom < 1 || numberRoom > 10) {
				System.out.println("Room number invalid.");
				System.out.println("Finished system!");
				System.exit(0);
			}
			rooms[--numberRoom] = rent;
		}

		System.out.println("");
		System.out.println("Busy rooms: ");
		for (int i = 0; i < numberRooms; i++) {
			if (rooms[i] != null) {
				System.out.println((i+1) + ": " + rooms[i]);
			}
		}
		sc.close();
	}

}
