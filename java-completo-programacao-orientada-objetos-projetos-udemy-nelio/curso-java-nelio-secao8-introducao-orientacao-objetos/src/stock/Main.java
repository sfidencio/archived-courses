package stock;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import stock.entities.Product;

/**
 * Permite cadastrar produtos Efetuar entrada no estoque Baixa de estoque Mostra
 * o saldo de estoque/inventario
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-08
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Product p = null;
			Locale.setDefault(Locale.US);
			List<Product> produtos = new ArrayList<>(0);
			int option = 0;
			double price = 0.0d, quantity = 0.0d;
			while (true) {
				System.out.flush();
				System.out.println("**SYSSTOCK - 1.0a**");
				System.out.println(
						"1-REGISTER PRODUCT\n2-ENTRY PRODUCT STOCK\n3-PRODUCT OUT OF STOCK\n4-INVENTORY REPORT\n5-EXIT");
				System.out.println("**SYSSTOCK - 1.0a**");
				option = sc.nextInt();
				// REGISTER
				if (option == 1) {
					p = new Product();
					System.out.print("[REGISTER_PRODUCT]=>Enter with [CODE] product: ");
					p.setCode(sc.nextInt());

					int productExists = -1;
					// Checa se produto ja existe
					for (int i = 0; i < produtos.size(); i++) {
						if (produtos.get(i).getCode() == p.getCode()) {
							productExists = i;
						}
					}

					if (productExists >= 0) {
						System.out.println("Product already exists: " + p.getCode());
						continue;
					}

					System.out.print("[REGISTER_PRODUCT]=>Enter with [NAME] product: ");
					p.setName(sc.next());
					produtos.add(p);
					System.out.println("[REGISTER_PRODUCT]=>Product has be registered sucessfully!\n\n");
					// ENTRY PRODUCT STOCK
				} else if (option == 2) {
					System.out.print("[ENTRY_PRODUCT_STOCK]=>Enter product [CODE] to input stock: ");
					int codeSearch = sc.nextInt();
					int positionRegProductList = -1;
					for (int i = 0; i < produtos.size(); i++) {
						if (produtos.get(i).getCode() == codeSearch) {
							positionRegProductList = i;
						}
					}

					if (positionRegProductList < 0) {
						System.out.println("\n[ENTRY_PRODUCT_STOCK]=>Product not found: " + codeSearch + "\n\n");
						continue;
					}

					System.out.println(
							"[ENTRY_PRODUCT_STOCK	]=>Product selected: " + produtos.get(positionRegProductList));

					if (Objects.nonNull(p)) {
						System.out.print("[ENTRY_PRODUCT_STOCK]=>Enter with [QUANTITY] increase: ");
						quantity = sc.nextDouble();
						System.out.print("[ENTRY_PRODUCT_STOCK]=>Enter with [PRICE] product: ");
						price = sc.nextDouble();
						produtos.get(positionRegProductList).addStock(quantity, price);
					}
					// PRODUCT OUT OF STOCK (Saida)
				} else if (option == 3) {
					System.out.print("[OUT_OF_PRODUCT_STOCK]=>Enter product [CODE] to output stock: ");
					int codeSearch = sc.nextInt();
					int positionRegProductList = -1;
					for (int i = 0; i < produtos.size(); i++) {
						if (produtos.get(i).getCode() == codeSearch) {
							positionRegProductList = i;
						}
					}

					if (positionRegProductList < 0) {
						System.out.println("\n[OUT_OF_PRODUCT_STOCK]=>Product not found: " + codeSearch + "\n\n");
						continue;
					}

					System.out.println(
							"[OUT_OF_PRODUCT_STOCK]=>Product selected: " + produtos.get(positionRegProductList));

					
					if (Objects.nonNull(p)) {
						System.out.print("[OUT_OF_PRODUCT_STOCK]=>Enter with [QUANTITY] decrease: ");
						quantity = sc.nextDouble();
						produtos.get(positionRegProductList).removeStock(quantity);
					}
				} else if (option == 4) {
					System.out.print("**INVENTORY REPORT - BEGIN - **\n");
					for (int i = 0; i < produtos.size(); i++) {
						System.out.println("----------------------------------------");
						System.out.println("Code: " + produtos.get(i).getCode());
						System.out.println("Name: " + produtos.get(i).getName());
						System.out.printf("Price: $ %.2f%n", produtos.get(i).getPrice());
						System.out.printf("Stock: %.2f%n", produtos.get(i).getStock());
						System.out.printf("Total: $ %.2f%n", produtos.get(i).getInventoryValue());
						System.out.println("----------------------------------------");
					}
					if (produtos.size() == 0)
						System.out.print("No itens in inventory!\n");
					System.out.print("**INVENTORY REPORT - END - **\n\n");

				} else if (option == 5) {
					System.out.println("**FIM DO PROGRAMA**");
					break;
				}

			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			//main(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//main(args);
		} finally {
			sc.close();
		}
	}

}
