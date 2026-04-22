package orders.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import orders.entities.Customer;
import orders.entities.Order;
import orders.entities.enums.OrderStatus;

public class OrderMain2 {

	/**
	 * @author Sebastiao Fidencio - Classe principal criar pedido
	 * @version 1.0
	 * @throws ParseException
	 * @since 2022-04-29
	 *
	 */
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Order order = new Order(new Date(), OrderStatus.PENDING_PAYMENT,
				new Customer("Sebastiao Fidencio", "sfidencio@gmail.com", sdf1.parse("12/02/1986")));
		System.out.println(order);
		System.out.println("Nome do enum: " + order.getOrderStatus().name());
		System.out.println("Número ordinal do enum: " + order.getOrderStatus().ordinal());

		// Convertendo string para enum
		OrderStatus orderStatus = OrderStatus.valueOf("SHIPPED");
		System.out.println(orderStatus.name());
		System.out.println(orderStatus.ordinal());

		OrderStatus orderStatus1 = OrderStatus.valueOf("DELIVERED");
		System.out.println(orderStatus1.name());
		System.out.println(orderStatus1.ordinal());

		//Sem precisar converter
		OrderStatus orderStatus2 = OrderStatus.PROCESSING;
		System.out.println(orderStatus2);
		
		//Cliente - obtendo o cliente do pedido. Retorna o toString() definido no objeto cliente.
		System.out.println(order.getCustomer());

	}

}
