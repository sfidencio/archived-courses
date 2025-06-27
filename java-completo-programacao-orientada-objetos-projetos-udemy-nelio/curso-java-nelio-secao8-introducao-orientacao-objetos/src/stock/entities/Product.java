package stock.entities;

public class Product {
	private int code;
	private String name;
	private double price;
	private double stock;

	public Product() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void addStock(double quantity, double price) {
		if (price == 0)
			throw new IllegalArgumentException(
					"Price product cannot be zero/Preço do produto não pode ser igual a zero!");

		if (quantity == 0)
			throw new IllegalArgumentException(
					"Quantity has to be greater than zero/Quantidade tem que ser maior que zero!");
		this.stock += quantity;
		this.price = price;
	}

	public void removeStock(double quantity) {
		if (quantity == 0)
			throw new IllegalArgumentException(
					"Quantity has to be greater than zero/Quantidade tem que ser maior que zero!");

		if (quantity > this.stock)
			throw new IllegalArgumentException("Quantity above available stock/Quantidade acima do estoque disponível");

		this.stock -= quantity;
	}

	public double getInventoryValue() {
		return stock * price;

	}

	@Override
	public String toString() {
		return "[ Code: " + this.code + ", Name: " + this.name + ", Price: $ " + String.format("%.2f", this.price) + ", Stock: "
				+ String.format("%.2f", this.stock) + "]";

	}

}
