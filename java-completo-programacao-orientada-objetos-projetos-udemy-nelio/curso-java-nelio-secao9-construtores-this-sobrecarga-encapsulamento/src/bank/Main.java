/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import bank.entities.Account;
import bank.entities.OperationTypeEnum;

/**
 * @author Sebastiao Fidencio
 *         Em um banco, para se cadastrar uma conta bancária, é
 *         necessário informar o número da conta, o nome do titular da conta, e
 *         o valor de depósito inicial que o titular depositou ao abrir a conta.
 *         Este valor de depósito inicial, entretanto, é opcional, ou seja: se o
 *         titular não tiver dinheiro a depositar no momento de abrir sua conta,
 *         o depósito inicial não será feito e o saldo inicial da conta será,
 *         naturalmente, zero. Importante: uma vez que uma conta bancária foi
 *         aberta, o número da conta nunca poderá ser alterado. Já o nome do
 *         titular pode ser alterado (pois uma pessoa pode mudar de nome por
 *         ocasião de casamento, por exemplo). Por fim, o saldo da conta não
 *         pode ser alterado livremente. É preciso haver um mecanismo para
 *         proteger isso. O saldo só aumenta por meio de depósitos, e só diminui
 *         por meio de saques. Para cada saque realizado, o banco cobra uma taxa
 *         de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não
 *         for suficiente para realizar o saque e/ou pagar a taxa. Você deve
 *         fazer um programa que realize o cadastro de uma conta, dando opção
 *         para que seja ou não informado o valor de depósito inicial. Em
 *         seguida, realizar um depósito e depois um saque, sempre mostrando os
 *         dados da conta após cada operação. (exemplos nas próximas páginas)
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Locale.setDefault(Locale.US);
			Account acc = null;
			int numberAccount = 0;
			String holderAccount;
			double initialDepositAccount = 0.0d;
			char deposit = 'N';
			int option = 0;
			double withDrawValue = 0.0d;
			double depositValue = 0.0d;
			List<Account> accStorage = new ArrayList<Account>(0);

			while (true) {

				System.out.println("**SYSBANK - 1.0a**");
				System.out.println("1-OPEN ACCOUNT\n2-UPDATE ACCOUNT DATA\n3-WITHDRAW\n4-MAKE A DEPOSIT\n5-EXIT");
				System.out.println("**SYSBANK - 1.0a**");
				option = sc.nextInt();

				// NEW ACCOUNT
				if (option == 1) {
					System.out.print("Enter account number: ");
					numberAccount = sc.nextInt();
					if (numberAccount == 0)
						throw new Exception("Account number is required");
					System.out.print("Enter account holder: ");
					holderAccount = sc.next();
					if (holderAccount.length() == 0)
						throw new Exception("Account holder is required");
					System.out.print("Make initial deposit? (Y[y],N[n]): ");
					deposit = sc.next().charAt(0);

					if (!(deposit == 'N' || deposit == 'n') && !(deposit == 'Y' || deposit == 'y'))
						throw new Exception("Invalid initial deposit option");

					if (deposit == 'Y' || deposit == 'y') {
						System.out.print("Enter initial deposit: ");
						initialDepositAccount = sc.nextDouble();
					}

					if (initialDepositAccount > 0)
						acc = new Account(numberAccount, holderAccount, initialDepositAccount);
					else
						acc = new Account(numberAccount, holderAccount);

					if (Objects.nonNull(acc)) {
						if (!checkDuplicateAccount(accStorage, acc))
							accStorage.add(acc);
						else
							throw new Exception("Account already exists");
					}

					System.out.println("Account data: ");
					System.out.println(acc);

					// UPDATE ACCOUNT
				} else if (option == 2) {
					System.out.print("Enter account number: ");
					numberAccount = sc.nextInt();
					if (numberAccount == 0)
						throw new Exception("Account number is required");
					acc = searchAccount(accStorage, numberAccount);
					if (Objects.isNull(acc))
						throw new Exception("Account not found: " + numberAccount);
					System.out.println("Account data: ");
					System.out.println(acc);
					System.out.print("Enter account holder: ");
					holderAccount = sc.next();
					acc.setHolder(holderAccount);
					if (holderAccount.length() == 0)
						throw new Exception("Account holder is required");
					updateAccount(accStorage, acc);
					acc = searchAccount(accStorage, numberAccount);

					System.out.println("Account data: ");
					System.out.println(acc);

				} // WITHDRAW
				else if (option == 3) {
					System.out.print("Enter account number: ");
					numberAccount = sc.nextInt();
					if (numberAccount == 0)
						throw new Exception("Account number is required");
					acc = searchAccount(accStorage, numberAccount);
					if (Objects.isNull(acc))
						throw new Exception("Account not found: " + numberAccount);
					System.out.println("Account data: ");
					System.out.println(acc);

					System.out.print("Enter with [WITHDRAWAL] amount $: ");
					withDrawValue = sc.nextDouble();
					if (withDrawValue == 0)
						throw new Exception("WITHDRAWAL amount cannot be zero");

					// Make Withdrawal
					acc.updateBalance(OperationTypeEnum.WITHDRAW, withDrawValue);

					updateAccountWithdraw(accStorage, acc);
					acc = searchAccount(accStorage, numberAccount);
					if (Objects.isNull(acc))
						throw new Exception("Account not found: " + numberAccount);
					System.out.println("Account data: ");
					System.out.println(acc);
					// DEPOSIT
				} else if (option == 4) {
					System.out.print("Enter account number: ");
					numberAccount = sc.nextInt();
					if (numberAccount == 0)
						throw new Exception("Account number is required");
					acc = searchAccount(accStorage, numberAccount);
					if (Objects.isNull(acc))
						throw new Exception("Account not found: " + numberAccount);
					System.out.println("Account data: ");
					System.out.println(acc);

					System.out.print("Enter with [DEPOSIT] amount $: ");
					depositValue = sc.nextDouble();
					if (depositValue == 0)
						throw new Exception("DEPOSIT amount cannot be zero");

					// Make Deposit
					acc.updateBalance(OperationTypeEnum.DEPOSIT, depositValue);
					updateAccountDeposit(accStorage, acc);
					acc = searchAccount(accStorage, numberAccount);
					if (Objects.isNull(acc))
						throw new Exception("Account not found: " + numberAccount);
					System.out.println("Account data: ");
					System.out.println(acc);

				} else if (option == 5) {
					System.out.println("System finished!");
					System.exit(0);
				}
			}

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			main(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

	public static boolean checkDuplicateAccount(List<Account> accStorage, Account newAccount) {
		for (Account account : accStorage) {
			if (account.equals(newAccount)) {
				return true;
			}
		}
		return false;
	}

	public static Account searchAccount(List<Account> accStorage, int numberAccount) {
		for (Account account : accStorage) {
			if (account.getNumber() == numberAccount) {
				return account;
			}
		}
		return null;
	}

	public static void updateAccount(List<Account> accStorage, Account accUpdate) {
		for (Account account : accStorage) {
			if (account.getNumber() == accUpdate.getNumber()) {
				account.setHolder(accUpdate.getHolder());
			}
		}
	}

	public static void updateAccountWithdraw(List<Account> accStorage, Account accWithdraw) {
		for (Account account : accStorage) {
			if (account.getNumber() == accWithdraw.getNumber()) {
				account = accWithdraw;
			}
		}
	}

	public static void updateAccountDeposit(List<Account> accStorage, Account accDeposit) {
		for (Account account : accStorage) {
			if (account.getNumber() == accDeposit.getNumber()) {
				account = accDeposit;
			}
		}
	}

}
