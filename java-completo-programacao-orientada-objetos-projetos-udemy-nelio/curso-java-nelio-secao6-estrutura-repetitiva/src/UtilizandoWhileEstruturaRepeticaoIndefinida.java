import java.util.Scanner;

public class UtilizandoWhileEstruturaRepeticaoIndefinida {
	public static void main(String args[]) {
		int numeroDigitado,somatorio = 0,contador=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("======Somatorio indefinido de números======");

		//Teria outra forma de avaliar a condicao do while, sem a necessidade inserir o break internamente 
		//Seria o caso 
		while (true) {
			contador++;
			System.out.println("Entre com " +  contador + "º número a ser somado: ");
			numeroDigitado = sc.nextInt();
			somatorio += numeroDigitado;
			if(numeroDigitado==0)
				break;
		}
		System.out.println("Resultado da soma: " + somatorio);
		sc.close();
	}

}
