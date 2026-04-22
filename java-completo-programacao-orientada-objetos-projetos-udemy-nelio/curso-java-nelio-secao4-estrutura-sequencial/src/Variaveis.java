public class Variaveis {
	public static void main(String[] args) {

		/*
		 * Nomes de variáveis Não pode começar com dígito: use uma letra ou _ Não pode
		 * ter espaço em branco Não usar acentos ou til Sugestão: use o padrão
		 * "camel case"
		 */

		/*
		 * Variavel do tipo byte com 8bits(1byte). -127 ate 128 - Valor padrao e 0
		 */
		byte valorMinimoByte = -128;
		byte valorMaximoByte = 127;
		System.out.println("Valor Mínimo Variavel do tipo byte: " + valorMinimoByte);
		System.out.println("Valor Máximo Variavel do tipo byte: " + valorMaximoByte);

		/*
		 * Variavel do tipo short 16 bits (2 bytes) -32768 a 32767 - Valor padrao 0
		 */
		short valorMinimoShort = -32768;
		short valorMaximoShort = 32767;
		System.out.println("Valor Mínimo Variavel do tipo short: " + valorMinimoShort);
		System.out.println("Valor Máximo Variavel do tipo short: " + valorMaximoShort);

		/*
		 * Variavel do tipo int 32 bits (4bytes) -2147483648 a 2147483647 - valor padrao
		 * 0
		 */
		int valorMinimoInt = -2147483648;
		int valorMaximoInt = 2147483647;
		System.out.println("Valor Mínimo Variavel do tipo int: " + valorMinimoInt);
		System.out.println("Valor Máximo Variavel do tipo int: " + valorMaximoInt);

		/*
		 * Variavel do tipo long 64 bits -9223372036854770000 a 9223372036854770000 -
		 * valor padrao 0l
		 */
		long valorMinimoLong = -9223372036854770000l;
		long valorMaximoLong = 9223372036854770000l;
		System.out.println("Valor Mínimo Variavel do tipo long: " + valorMinimoInt);
		System.out.println("Valor Máximo Variavel do tipo long: " + valorMaximoInt);

		System.out.println("OK, acima temos os tipos numéricos inteiros.");

		/*
		 * 4Bytes Tipo numerico com ponto flutuante. (Decimais) Variavel do tipo float
		 * 32 bits -1,4024E-37 a 3,4028E+38 - valor padrao 0.0f
		 */
		float valorMinimoFloat = -1.4024E-37f;
		float valorMaximoFloat = 3.4028E+38f;
		System.out.println("Valor Mínimo Variavel do tipo float: " + valorMinimoFloat);
		System.out.println("Valor Máximo Variavel do tipo float: " + valorMaximoFloat);

		/*
		 * 8Bytes Tipo numerico ponto flutuante com precisao dupla. (Decimais) Variavel
		 * do tipo float 64 bits -1,4024E-37 a 3,4028E+38 - valor padrao 0.0d
		 */
		double valorMinimoDouble = -4.94E-307d;
		double valorMaximoDouble = 1.79E+308d;
		System.out.println("Valor Mínimo Variavel do tipo double: " + valorMinimoDouble);
		System.out.println("Valor Máximo Variavel do tipo double: " + valorMaximoDouble);

		System.out.println("OK, acima temos os tipos numéricos com ponto flutuante, tanto com uma e dupla precisão.");

		/*
		 * Caracter Unicode. - 16bits(2Bytes) Intervalo => '\u0000' a '\uFFFF'
		 *
		 */
		char a = '\u0061';
		char b = '\u0062';
		// char c = '\uFFFF';
		System.out.println("Letra : <<" + a + ">> e Letra: <<" + b + ">>");
		// System.out.println(c);
		System.out.println("OK, acima temos caracter unicode.");

		/* Valor Verdade. -1bit - true ou false - padrao false */
		boolean isSaldoDevedor = true;
		boolean isAberta = false;
		System.out.println("Saldo do cartão de credito esta devedor? " + isSaldoDevedor);
		System.out.println("A porta esta aberta? " + isAberta);

		System.out.println("Melhorando a logica abaixo utilizando operador ternario.");

		System.out.println("Saldo do cartão de credito esta devedor=> " + (isSaldoDevedor ? "SIM" : "NAO"));
		System.out.println("A porta esta aberta=> " + (isAberta ? "SIM" : "NAO"));
	

		/**
		 * Logo, variavel possui o nome ou identificar, possui tipo e tambem valor. Alem
		 * disso possui um endereço de memória, que permite o programa acessá-la. Ou
		 * seja, em qual local da memoria RAM ela esta alojada.
		 **/

		/*
		 * Tipos primitivos em Java Descrição Tipo Tamanho Valores Valor padrão
		 * 
		 * tipos numéricos inteiros
		 * 
		 * byte 8 bits - 128 a 127 - valor padrao 0 Explicacao o porque tipo byte e 8
		 * bits.. 1 bit pode receber 2 possibilidades => 0 ou 1, então uma variavel de 8
		 * bits., 8 bits => 2x2x2x2x2x2x2x2 => 2^8 = 256 possibilidades. * ou seja,
		 * posso aramazenar em uma variavel de 8 bits,de 0 ate 255. ou seja, 256 valores
		 * direferentes. Porem na linguagem java, os valores inteiros podem ser
		 * positivos ou negativos, logo divide metade desses 256, 128 para numeros
		 * negativos e 128 para positivos, ficando -128 ~ 127
		 * 
		 * Resumindo, utilizo o tipo byte, quando a
		 * 
		 * 
		 * 
		 * 
		 * 
		 * short 16 bits -32768 a 32767 - valor padrao 0
		 * 
		 * 
		 * 
		 * 
		 * int 32 bits -2147483648 a 2147483647 - valor padrao 0
		 * 
		 * long 64 bits -9223372036854770000 a 9223372036854770000 - valor padrao 0L
		 * 
		 * tipos numéricos com ponto flutuante
		 * 
		 * float 32 bits -1,4024E-37 a 3,4028E+38 - valor padrao 0.0f
		 * 
		 * double 64 bits -4,94E-307 a 1,79E+308 0.0 - valor padrao 0.0d
		 * 
		 * um caractere Unicode char 16 bits '\u0000' a '\uFFFF' '\u0000'
		 * 
		 * valor verdade boolean 1 bit {false, true} - valor padrao e false
		 * 
		 * String - cadeia de caracteres (palavras ou textos)
		 * 
		 * Veja: unicode-table.com Exemplo: 'a' = '\u0061'
		 */

	}
}
