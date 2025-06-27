package orders.entities;

import java.math.BigDecimal;

/**
 * @author Sebastiao Fidencio - Entidade Produto
 * @version 1.0
 * @since 2022-04-28
 */
public class Product {
	private String name;
	private BigDecimal price;

	public Product(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
