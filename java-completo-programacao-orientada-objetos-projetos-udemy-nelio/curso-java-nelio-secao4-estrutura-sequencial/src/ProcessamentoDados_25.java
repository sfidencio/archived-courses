
public class ProcessamentoDados_25 {

	public static void main(String[] args) {
		// Calcular area trapezio
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		//Casting - observe que o 
		int a1, b1;
		double c1,c4;
		a1=5;
		b1=2;
		c1=(double)a1/b1;
		System.out.println(c1);
		
		//Arredondando
		c4=(int)a1/b1; //Observe o casting explicito 
		System.out.println(c4);
		
		
	}

}
