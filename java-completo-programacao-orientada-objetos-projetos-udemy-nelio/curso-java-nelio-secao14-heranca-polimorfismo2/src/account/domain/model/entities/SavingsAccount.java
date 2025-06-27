package account.domain.model.entities;

import java.math.BigDecimal;

public class SavingsAccount extends Account { //Se colocarmos o final na classe, evitar criar subclasse a partir desta.
    private BigDecimal interestRate = new BigDecimal("0.07");//Taxa de Juros

    public SavingsAccount(int number, String holder) {
        super(number, holder);
        this.interestRate = interestRate;
    }

    @Override //Se colocarmos final no metodo, ele tambem nao pode ser sobreposto por classes filhas ou subclasses
    public final void withDraw(BigDecimal amount) {
        this.balance = (this.balance.subtract(amount));
        this.balance = this.balance.add(interestRate);
    }


}
