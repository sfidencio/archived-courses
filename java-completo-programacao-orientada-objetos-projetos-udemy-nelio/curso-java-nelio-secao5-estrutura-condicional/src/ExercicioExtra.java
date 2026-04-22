import java.util.Scanner;

public class ExercicioExtra {
	public static void main(String[] args) {
		/**
		 * [EXERCICIO PROPOSTO]
		 *1-Faça um programa que:
		 * 
		 * 1.1-receba o preço de um produto, 
		 * 2.2-calcule e mostre o novo preço.
		 * sabendo-se que este sofreu um desconto de 10%.
		 */
	    //Sempre que for implementar um caso de uso, tente quebrar o problema maior em partes menores.
		//Fique atento, e ataque o fulcro ou nucleo do problema a ser resolvido.
		
		//Vamos utilizar o tipos primitivos do java, não iremos nos preocupar em 
		//utilizar classes Wrappers tais como BigDecimal para cenários mais reais.
		//1.1
		double precoProduto =0d;
	    //Observe que estamos utilizando Locale padrao pt-br, ou seja, o separador de decimal e a virgula
		//Para mudar, basta chamar Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		System.out.println("Informe o preco do produto: ");
		precoProduto = sc.nextDouble();
		
		//Calcular novo preço aplicando desconto de 10%
		//Para subtrair 10% de uma valor..?
		precoProduto-=Math.abs(precoProduto*0.1d);
     	/*
		 *Explicando:
		 *Observe que nao foi necessario criar uma nova variavel para receber o novo preco com desconto.
		 *Pois utilizamos o operador de atribuição cumulativo, -=, +=, *=, o codigo fica mais legivel e com sematica mais limpa
		 *, o Math.abs, é um função matematica que transformar um numero negativo em positivo, isso foi feito porque quando 
		 *subtrai 2,50 de 0,25 que é 10% de 2,50, ele retorna negativo, lembra da matematica do jogo de sinais?
		 *+ com - => é -...etc..etc.
		 */
		System.out.printf("Valor final do produto com desconto: %.2f%n",precoProduto);
	}

}
