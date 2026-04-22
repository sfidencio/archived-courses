package account.domain.model.entities;

import java.math.BigDecimal;


//public final class Account { // Se colocar a keyword final na classe base, ela nao pode ser herdada
public class Account { // Por padrao qualquer objeto java herda de "Object"
    private int number;
    private String holder; // Titular
    //protected final BigDecimal balance; // Saldo - Se colocarmos a keyword final no atributo..nao aceita ser modificado
    protected BigDecimal balance; // Saldo

    private BigDecimal withdrawalFee  = new BigDecimal("5.30"); //Taxa Saque

    public Account(int number, String holder) {
        super();
        this.number = number;
        this.holder = holder;
        this.balance = new BigDecimal("0.00");
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


    public void withDraw(BigDecimal amount) {
        if (this.balance.doubleValue() < amount.doubleValue())
            throw new IllegalArgumentException("Insufficient funds");
        this.balance = (this.balance.subtract(amount)).subtract(withdrawalFee);
    }

    public void deposit(BigDecimal amount) {
        if (amount.doubleValue() <= 0)
            throw new IllegalArgumentException("Quantity not allowed");
        this.balance = this.balance.add(amount);
    }


    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
