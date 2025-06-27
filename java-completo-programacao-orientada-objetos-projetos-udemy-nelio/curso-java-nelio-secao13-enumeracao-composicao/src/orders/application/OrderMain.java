package orders.application;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import orders.entities.Customer;
import orders.entities.Order;
import orders.entities.OrderItem;
import orders.entities.Product;
import orders.entities.enums.OrderStatus;

public class OrderMain {

	/**
	 * @author Sebastiao Fidencio - Classe principal criar pedido
	 * @version 1.0
	 * @throws ParseException
	 * @since 2022-04-29
	 *
	 */
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			// Locale.setDefault(Locale.US);

			System.out.println("Enter customer data: ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Birth Date [Ex: dd/MM/yyyy]: ");
			Date birthDate = sdf.parse(sc.next());
			Customer c = new Customer(name, email, birthDate);

			System.out.println("Enter order data: ");
			System.out.print("Status [PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED]: ");
			OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

			// Register Order
			Order order = new Order(new Date(), orderStatus, c);

			System.out.print("How many items to this order? ");
			System.out.println();

			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter " + i + "# item data:");
				System.out.print("Product name: ");
				String produtcName = sc.next();
				System.out.print("Product price: ");
				BigDecimal price = new BigDecimal(sc.nextDouble());
				System.out.print("Product quantity: ");
				BigDecimal quantity = new BigDecimal(sc.nextDouble());
				// Create order item
				OrderItem orderItem = new OrderItem(quantity, price, new Product(produtcName, price));
				// Adding item in order
				order.addItem(orderItem);
			}

			System.out.println(order);

		} catch (InputMismatchException e) {
			System.out.println("Erro de conversao=>" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
