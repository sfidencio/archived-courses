package orders.entities;

import java.math.BigDecimal;

/**
 * @author Sebastiao Fidencio - Entidade Item do Pedido
 * @version 1.0
 * @since 2022-04-22
 */
public class OrderItem {
	private BigDecimal quantity;
	private BigDecimal price;
	private Product product;

	public BigDecimal getQuantity() {
		return quantity;
	}

	public OrderItem(BigDecimal quantity, BigDecimal price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.setProduct(product);
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal subTotal() {
		BigDecimal result = this.quantity.multiply(this.price);
		return result;
	}

}
