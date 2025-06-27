import java.util.Scanner;

public class ExpressaoCondicionalTernaria2 {

	public static void main(String[] args) {
		double price = 2.90d; //Preco
		double discount = 0.03d; //3%
		//Utilizei o operador ternario, mas poderia utilizar por exemplo if/else
		price = (price<2.91) ? price-=(price*discount):price;
		System.out.println("Preco: " + price);
	}

}
