package workers.application;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import workers.entities.Department;
import workers.entities.HourContract;
import workers.entities.Worker;
import workers.entities.enums.WorkLevel;

public class WorkerMain {

	/**
	 * @author Sebastiao Fidencio - Ler os dados de um trabalhador com N contratos
	 *         (N fornecido pelo usuário). Depois, solicitar do usuário um mês e
	 *         mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
	 *         (próxima página).
	 * @version 1.0
	 * @since 2022-04-22
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Locale.setDefault(Locale.US);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Enter departament name: ");
			String departmentName = sc.next();
			System.out.println("Enter worker data: ");
			System.out.print("Name: ");
			String workerName = sc.next();
			System.out.print("Level: ");
			String workLevel = sc.next();
			System.out.print("Base salary: ");
			Double baseSalary = sc.nextDouble();
			Worker worker = new Worker(workerName, WorkLevel.valueOf(workLevel), new BigDecimal(baseSalary),
					new Department(departmentName));

			System.out.print("How many contracts to this worker? ");
			int qtdContracts = sc.nextInt();

			for (int i = 1; i <= qtdContracts; i++) {
				System.out.println("Enter contract #" + i + " data:");
				System.out.print("Date (DD/MM/YYYY): ");
				Date contractDate = sdf.parse(sc.next());
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Duration (hours): ");
				int hours = sc.nextInt();
				HourContract contract = new HourContract(contractDate, new BigDecimal(valuePerHour), hours);
				worker.addContract(contract);
			}

			System.out.println();
			System.out.print("Enter MONTH and YEAR to calculate income (MM/YYYY): ");
			String monthAndYear = sc.next();

			// int month = Integer.parseInt(monthAndYear.substring(0, 2));
			// int year = Integer.parseInt(monthAndYear.substring(3));
			int month = Integer.parseInt(monthAndYear.split("/")[0]);
			int year = Integer.parseInt(monthAndYear.split("/")[1]);

			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName());
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

			sc.close();

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			main(args);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
