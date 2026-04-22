import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		try {
			/*
			 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
			 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
			 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
			 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
			 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
			 * será encerrado quando o código informado for o número 4. Deve ser escrito a
			 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
			 * tipo de combustível, conforme exemplo.
			 */
			int tipoCombustivel = 0, qtdClientesAlcool = 0, qtdClientesDiesel = 0, qtdClientesGasolina = 0;

			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.println("**BEM VINDOS AO POSTO FITAL**");
				System.out.println(
						"===SELECIONE O COMBUSTIVEL===\n|1-ALCOOL\n|2-GASOLINA\n|3-DIESEL\n|4-FIM\n===SELECIONE O COMBUSTIVEL===");
				tipoCombustivel = sc.nextInt();

				switch (tipoCombustivel) {
				case 1:
					System.out.println("SELECIONADO ALCOOL");
					qtdClientesAlcool++;
					break;
				case 2:
					System.out.println("SELECIONADO GASOLINA");
					qtdClientesGasolina++;
					break;
				case 3:
					System.out.println("SELECIONADO DIESEL");
					qtdClientesDiesel++;
					break;
				case 4:
					break;

				default:
					continue;
				}

				if (tipoCombustivel == 4)
					break;
			}

			System.out.println("**SISTEMA FINALIZADO**");
			System.out.println("**MUITO OBRIGADO**");
			System.out.println("|Qtde clientes abasteceram 1-Alcool: " + qtdClientesAlcool);
			System.out.println("|Qtde clientes abasteceram 2-Gasolina: " + qtdClientesGasolina);
			System.out.println("|Qtde clientes abasteceram 3-Diesel: " + qtdClientesDiesel);

		} catch (InputMismatchException e) {
			System.out.println("Deve ser informado um número. O Programa de abastecimentos será reiniciado!");
			main(args); // Chamada recursiva
		}
	}
}
