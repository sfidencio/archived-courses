public class OperadoresAtribuicaoCumulativa {

	public static void main(String[] args) {

		System.out.println("Somando ou acumulando valores: ");
		int a = 1;
		int b = 2;
		a = a + b;

		System.out.println(a);

		// Outro forma de fazer seria usar operador de atribuição cumulativa
		int c = 3;
		int d = 4;
		c += d; // equivalente À [ c = c + d ]

		System.out.println(c);

		// A mesma coisa funciona para *, / ou -
		// Multiplicacao
		int e = 5;
		int f = 6;
		e *= f;
		System.out.println(e);

		e = 5;
		f = 6;
		e = e * f;
		System.out.println(e);

		// Divisao
		int g = 10;
		int h = 5;
		g/=h; //igual à [g = g/h]
		System.out.println(g);
		
		//Modulo ou resto divisao
		int i=20;
		int j=6;
		i%=j; //equivale À [i = i%j]
		System.out.println(i);
		
		
	}

}
