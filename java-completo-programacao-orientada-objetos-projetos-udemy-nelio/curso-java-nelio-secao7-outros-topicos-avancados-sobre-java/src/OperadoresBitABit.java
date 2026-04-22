/**
* Esta classe explora a utilizacao de operadores bit a bit, amplamente utilizado em programacao de baixo nivel
* @author  Sebastiao Fidencio
* @version 1.0
* @since   2022-01-07
*/
public class OperadoresBitABit {

	public static void main(String[] args) {
		//BitWise - Utilizando muito em programacao de baixo nivel. C/C++ (Microcontrolador,Arduino,Interface Rede)
		
		/*
		 *  Operadores bitwise
			Operador Significado
			& Operação "E" bit a bit
			| Operação "OU" bit a bit
			^ Operação "OU-exclusivo" bit a bit

			C1 C2 C1 E C2
			F  F     F
			F  V     F
			V  F     F
			V  V     V

			C1 C2 C1 OU C2
			F  F      F
			F  V      V
			V  F      V
			V  V      V

			C1 C2 C1 XOR C2
			F   F 		F
			F   V 		V
			V   F 		V
			V   V 		F
			
			*/
		
		/*
		 *Converter Decimal para Binario, (Pode utilizar a calculadora do windows em modo programador tambem)
		 *
		 * Ex: 
		 * Como seria 5 em binario? => 101
		 * 
		 * 5 |_2
		 * 1    2|_2
		 *      0   1  =>  101
		 */
		
		int n1=89;
		int n2=60;
		int n3=5;
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));
		System.out.println(Integer.toBinaryString(n3));  //101
		System.out.println(Integer.toBinaryString(n1&n2));
		System.out.println(Integer.toBinaryString(n1|n2));
		System.out.println(Integer.toBinaryString(n1^n2));

	}

}
