package constructor;

/**
 * Overloads, this, constructor.
 * 
 * @author  Sebastiao Fidencio
 * @version 1.0
 * @since 2022-01-10
 */
public class Main {
	public static void main(String args[]) {
		Customer cc = new Customer();
		cc.setCode(1);
		cc.setName("Alex");
		cc.setCreditLimit(220.0);
		System.out.println(cc);

		Customer cc1 = new Customer(cc.getCode() + 1, cc.getName() + " - Changed");
		System.out.println(cc1);

		Customer cc2 = new Customer(cc.getCode() + 1, cc.getName() + " - Changed2", cc.getCreditLimit() * 2);
		System.out.println(cc2);

	}

}
