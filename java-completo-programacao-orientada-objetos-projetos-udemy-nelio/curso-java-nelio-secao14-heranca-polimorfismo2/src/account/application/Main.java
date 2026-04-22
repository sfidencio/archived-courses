package account.application;

import account.domain.model.entities.Account;
import account.domain.model.entities.BusinessAccount;
import account.domain.model.entities.SavingsAccount;

import java.math.BigDecimal;

public class Main {

    /**
     * @author Sebastiao Fidencio - Classe principal SISBANK
     * @version 1.0
     * @since 2022-04-29
     */
    public static void main(String[] args) {
        try {
            Account acc1 = new BusinessAccount(1, "Fulano");
            acc1.deposit(new BigDecimal("120.00"));
            System.out.println(acc1);
            acc1.withDraw(new BigDecimal("20.00"));
            System.out.println(acc1);

            Account acc2 = new SavingsAccount(2,"Beltrano");
            acc2.deposit(new BigDecimal("120.00"));
            System.out.println(acc2);
            acc2.withDraw(new BigDecimal("20.00"));
            System.out.println(acc2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
