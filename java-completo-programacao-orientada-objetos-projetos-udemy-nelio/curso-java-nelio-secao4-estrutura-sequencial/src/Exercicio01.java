import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int v1,v2,soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira parcela da soma: (Deve ser inteiro) ");
		v1 = sc.nextInt();
		System.out.println("Digite a segunda parcela da soma: (Deve ser inteiro) ");
		v2 = sc.nextInt();
		System.out.println("SOMA: ");
		soma = v1 + v2;
		System.out.println(soma);
	}

}
