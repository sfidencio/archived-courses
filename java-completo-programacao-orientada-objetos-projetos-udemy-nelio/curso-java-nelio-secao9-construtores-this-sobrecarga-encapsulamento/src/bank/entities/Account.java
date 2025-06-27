package bank.entities;

import java.util.Objects;

public class Account {
	private int number;
	private String holder;
	private double initialDeposit;
	private double balance;
	private final double withDrawalFeeAmount = 5.0d;

	public void updateBalance(OperationTypeEnum operationTypeEnum, double value) throws Exception {
		if (operationTypeEnum.equals(OperationTypeEnum.DEPOSIT)) {
			this.balance += value;
		} else {
			if (this.balance == 0)
				throw new Exception("Withdrawal cannot be performed when balance equals zero");
			this.balance -= value + this.withDrawalFeeAmount; // Withdrawal fee (Taxa Saque)
		}
	}

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		this.initialDeposit = 0.0d;

	}

	public Account(int number, String holder, double initialDeposit) throws Exception {
		super();
		this.number = number;
		this.holder = holder;
		this.initialDeposit = initialDeposit;
		if (initialDeposit > 0)
			this.updateBalance(OperationTypeEnum.DEPOSIT, initialDeposit);
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public double getWithDrawalFeeAmount() {
		return withDrawalFeeAmount;
	}

	@Override
	public String toString() {
		return "Account [number=" + this.number + ", holder=" + this.holder + ", Balance= $"
				+ String.format("%.2f", this.balance) + ", WithDrawal Fee Amount= $"
				+ String.format("%.2f", this.withDrawalFeeAmount) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return number == other.number;
	}

}
