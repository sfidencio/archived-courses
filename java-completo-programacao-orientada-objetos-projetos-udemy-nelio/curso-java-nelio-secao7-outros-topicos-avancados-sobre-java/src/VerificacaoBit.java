import java.util.Scanner;


/**
* Esta classe explora a utilizacao de operadores bit a bit, amplamente utilizado em programacao de baixo nivel
* @author  Sebastiao Fidencio
* @version 1.0
* @since   2022-01-07
*/
public class VerificacaoBit {

	public static void main(String[] args) {
		// BitWise - Utilizando muito em programacao de baixo nivel. C/C++
		// int mask = 32; //ou declarar o numero binario
		int mask = 0b00100000; // 32decimal  em binario ou base2
		int n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero decimal: ");
		n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true");
		} else {
			System.out.println("6th bit is false");
		}

	}

}
