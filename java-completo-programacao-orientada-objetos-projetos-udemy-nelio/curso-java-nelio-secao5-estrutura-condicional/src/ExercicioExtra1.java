import java.util.Scanner;
public class ExercicioExtra1 {
	public static void main(String[] args) {
		// Altera virgula <<pt-br>> por ponto <<en_us>>, separador decimais.
		// Locale.setDefault(Locale.US);
		/*
		 * [EXERCICIO PROPOSTO] 2-Um funcionário: 2.1-recebe um salário fixo mais 4% de
		 * comissão sobre as vendas. 2.2-Faça um programa que receba: 2.2.1-o salário
		 * fixo do funcionário e o; 2.2.2- valor de suas vendas, 3-calcule e mostre a
		 * comissão e seu salário final.
		 */

		// Se o salario é fixo, vamos declará-lo como um constante
		// Observe nome das variaveis, siga conveção camelCase ok?
		double salarioFixo = 4000.0d;// Vamos determinar um salario fixo de R$ 4000,00
		final double comissao = 0.04d; // Fique esperto, 4% é 4/100=>0,04 e 40% é 40/100=>0,4
		double valorTotalVendas = 0.0d; // Esta variavel pode mudar o valor, pois as vendas podem variar dentro do mês?
		String houveComisao = "";

		//(int) é um casting explicito, estou 'removendo' a virgula ou parte francionada do numero,.convertendo-o para inteiro.
		System.out.println("PARAMETRO INICIAS DO SISTEMA: \nSALARIO FIXO: R$ " + salarioFixo + "\nCOMISSÃO: "
				+ (int)(comissao * 100) + "%");
		Scanner sc = new Scanner(System.in);
		// Observe que mudei os requisitos por minha conta, no caso não irá exigir que o
		// usuario informe
		// Valor do salario fixo e nem a comissao, porque eu entendi nao ser
		// necessario..
		// Mas se o teu cliente bater o pé..que quer assim então faz, mas o papel do
		// analista é tambem questionar..
		// Com intuito de evitar retrabalho e refatoracao de codigo desnecessaria.
		// Logico que isto aqui e so um exemplo
		// Em situacoes reais..poderia mudar completamente o cenário.
		// Observe que o salarioFixo não é variavel com keyword "final", ou seja, nao
		// permitiria modificacao a principio..
		// Mas como irei utilizar a mesma variavel <<salarioFixo>> para acrescentar o
		// valor da comissão ao salario..então
		// Ela permitira modificar valor.
		System.out.println("[CALCULO_SALARIO]=> Entre com valor total das vendas <<PRESSIONE ENTER>>: ");
		valorTotalVendas = sc.nextDouble();

		System.out.println("[RELATORIO_COMISSAO]=> Relatório de comissionamento!");
		salarioFixo += (valorTotalVendas * comissao);
		if (valorTotalVendas > 0)
			houveComisao = "SIM";
		else
			houveComisao = "NAO";
		System.out.printf("Valor total do salario (salario fixo + comissao): %.2f%nHouve Comissao? %s", salarioFixo,
				houveComisao);

		// Ter uma mente um pouco aberta para regra de negócio é importante, logo o
		// analista de sistemas tem que
		// ter essa pegada para entender a Business Rule do sistema a ser desenvolvido,
		// não pode ficar dentro da bolha o tempo todo
		// tem que sair para fora e entender os requisitos funcionais da aplicação.

		sc.close();// Destroi o objeto responsavel por obter os dados do teclado físico do usuário.

	}

}
