/**
 * Esta classe explora a utilizacao da funcao SplitPart, da classe String,
 * funcao esta responavel por quebrar ou dividir uma String pelo delimitador Ex:
 * Pipe, Ponto e Virgula e etc.
 * 
 * @author Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-07
 */
public class UtilizandoSplitPart {

	public static void main(String[] args) {
		/*
		 * SplitPart muito utilizado quando deseja quebrar uma String por um determinado
		 * delimitador.
		 */

		/*
		 * Digamos que esse leiaute diz respeito a dados de arquivo texto a ser
		 * importado no sistema
		 * 
		 * 1º => Codigo 2º => Nome do Cliente 3º => CPF 4º => Endereco
		 */
		String dados = "001|JOAO RAMOS|4587452258|RUA DA VIDA BOA";
		String dados2 = "001 JOAO_RAMOS 4587452258 RUA_DA_VIDA_BOA";
		String[] dadosParticionados = dados.split("\\|"); // Observe que utilizei PIPE, mas poderia utilizar espaco por
															// exemplo.
		String[] dadosParticionados2 = dados2.split(" "); // Observe que utilizei PIPE, mas poderia utilizar espaco por
															// exemplo. (Porem teria problema por causa do nome da
															// rua/endereco e nome do cliente,
															// que possue espacos, mas ai substitui por undescore_)

		// Outra forma de acessar
		String codigoCliente = dadosParticionados[0];
		String nomeCliente = dadosParticionados[1];

		System.out.println("Codigo: " + codigoCliente + "\nNome: " + nomeCliente + "\n\n");

		// Agora vamos imprimir esses dados do vetor utilizando laco de repeticao
		for (int i = 0; i < dadosParticionados.length; i++)
			System.out.println("Dado numero " + i + ": " + dadosParticionados[i]);

		System.out.println("");

		for (int i = 0; i < dadosParticionados2.length; i++)
			System.out.println("Dado numero " + i + ": " + dadosParticionados2[i]);

	}

}
