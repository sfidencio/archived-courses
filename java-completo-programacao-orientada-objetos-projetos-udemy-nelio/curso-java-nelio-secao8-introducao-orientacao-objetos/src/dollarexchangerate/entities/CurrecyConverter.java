package dollarexchangerate.entities;

/**
 * Ler a cotacao dolar, depois um valor em dolares a ser comprado por uma pessoa
 * em reais. Informar quantos reais a pessoa vai pagar por dolar, considerando
 * que a pessoa terá um IOF de 6%.
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-09
 */
public class CurrecyConverter {
	private double dollarPrice = 0.0d;
	private double quantityDollarsToBeBought = 0.0d;
	private final double IOF = 0.06d;

	public double getDollarPrice() {
		return dollarPrice;
	}

	public void setDollarPrice(double dollarPrice) {
		this.dollarPrice = dollarPrice;
	}

	public double getQuantityDollarsToBeBought() {
		return quantityDollarsToBeBought;
	}

	public void setQuantityDollarsToBeBought(double quantityDollarsToBeBought) {
		this.quantityDollarsToBeBought = quantityDollarsToBeBought;
	}

	public double calculeDollarToReal() throws Exception {
		if (this.dollarPrice <= 0)
			throw new Exception("Price must not be less than zero/Cotação não pode ser menor que zero!");
		if (this.quantityDollarsToBeBought <= 0)
			throw new Exception(
					"Amount of dollars to be purchased must not be less than zero/Quantidade de doláres a serem comprados não pode ser menor que zero!");

		/*
		 * return this.dollarPrice * this.quantityDollarsToBeBought + ((this.dollarPrice
		 * * this.quantityDollarsToBeBought) * IOF);
		 */

		// ou

		return this.dollarPrice * this.quantityDollarsToBeBought * (1.0 + IOF);

	}

}
