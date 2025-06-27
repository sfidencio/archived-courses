package account.domain.model.entities;

import java.math.BigDecimal;

public class BusinessAccount extends Account {


    public BusinessAccount(int number, String holder) {
        super(number, holder);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void withDraw(BigDecimal amount) {
        super.withDraw(amount);
        this.balance = this.balance.subtract(new BigDecimal("1.47")); //Taxa de Saque para Empresa
    }
}
