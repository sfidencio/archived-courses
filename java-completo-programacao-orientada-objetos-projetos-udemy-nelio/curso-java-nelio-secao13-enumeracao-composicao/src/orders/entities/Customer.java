package orders.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sebastiao Fidencio - Entidade Cliente
 * @version 1.0
 * @since 2022-04-28
 */
public class Customer {
	private String name;
	private String email;
	private Date birthDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Customer() {
		super();
	}

	public Customer(String name, String email, Date birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", birthDate=" + sdf.format(birthDate) + "]";
	}
}
