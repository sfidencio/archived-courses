package orders.entities;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import orders.entities.enums.OrderStatus;

/**
 * @author Sebastiao Fidencio - Entidade Pedido
 * @version 1.0
 * @since 2022-04-28
 */
public class Order {
	private Date moment;
	private OrderStatus orderStatus;
	private Customer customer;
	private List<OrderItem> itens;
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	public Order(Date moment, OrderStatus orderStatus, Customer customer) {
		super();
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.customer = customer;
		if (this.itens == null)
			this.itens = new ArrayList<OrderItem>(0);
	}

	public void addItem(OrderItem orderItem) throws Exception {
		for (OrderItem item : this.itens)
			if (item.getProduct().getName().trim().equals(orderItem.getProduct().getName()))
				throw new Exception("Item already exists in the order.");
		this.itens.add(orderItem);
	}

	public Date getDate() {
		return moment;
	}

	public void setDate(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BigDecimal getTotal() {
		BigDecimal total = new BigDecimal(0.0);
		for (OrderItem item : this.itens)
			total = total.add(item.subTotal());
		return total;
	}

	@Override
	public String toString() {
		// return "Order [date=" + moment + ", orderStatus=" + orderStatus + "]";
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY\n");
		sb.append("Order moment: " + sdf1.format(moment) + "\n");
		sb.append("Order status: " + orderStatus.name().toUpperCase() + "\n");
		sb.append("Customer: " + customer.getName() + " (" + sdf2.format(customer.getBirthDate()) + ") - "
				+ customer.getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem item : this.itens)
			sb.append("Product Name: " + item.getProduct().getName() + ", Price: $"
					+ String.format("%.2f", item.getPrice()) + ", Quantity: " + item.getQuantity() + ", SubTotal: $"
					+ String.format("%.2f", item.subTotal()) + "\n");

		sb.append("Total price: $" + String.format("%.2f", getTotal()) + "\n");
		return sb.toString();
	}

}
