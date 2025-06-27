package constructor;

public class Customer {
	private int code;
	private String name;
	private double creditLimit = 0.0d;

	public Customer() {
		super();
	}

	public Customer(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Customer(int code, String name, double creditLimit) {
		super();
		this.code = code;
		this.name = name;
		this.creditLimit = creditLimit;
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

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Code: " + this.code + ", " + "Name: " + this.name + ", " + "Credit Limit: "
				+ String.format("%.2f", this.creditLimit);
	}

}
