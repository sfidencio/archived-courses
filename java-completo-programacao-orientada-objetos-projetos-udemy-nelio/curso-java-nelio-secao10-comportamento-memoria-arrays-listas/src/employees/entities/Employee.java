package employees.entities;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Sebastiao Fidencio
 * 	       This project by investing in primitive types such as double,
 *         using the Wrappers, and BigDecimal in place of Double.
 */
public class Employee {
	private Long id;
	private String name;
	private BigDecimal salary;

	public void adjustSalary(BigDecimal percentage) throws Exception {
		if (this.salary.doubleValue() <= 0)
			throw new Exception("Salary cannot be less than or equal to zero");
		this.salary = this.salary.add(salary.multiply(percentage.divide(new BigDecimal("100"))));
	}

	public Employee(Long id, String name, BigDecimal salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		// return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		return id + ", " + name + ", $ " + String.format("%.2f", salary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

}
