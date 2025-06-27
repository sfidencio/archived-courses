package account.domain.model.entities;

import java.math.BigDecimal;

public class Account { // Por padrao qualquer objeto java herda de "Object"
	private int number;
	private String holder; // Titular
	private BigDecimal balance; // Saldo

	public Account(int number, String holder, BigDecimal balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
