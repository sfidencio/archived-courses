package workers.application;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import workers.entities.Department;
import workers.entities.HourContract;
import workers.entities.Worker;
import workers.entities.enums.WorkLevel;

public class WorkerMain2 {

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
			Worker worker = null;
			Department department = null;
			HourContract hourContract = null;
			List<Department> departamentRepository = new ArrayList<Department>(0);
			List<Worker> workersRepository = new ArrayList<Worker>(0);
			List<HourContract> hourContractsRepository = new ArrayList<>(0);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			int option = 0;
			while (true) {
				System.out.println("**SYSWORKER - 1.0a**");
				System.out.println(
						"1-REGISTER DEPARTAMENT\n2-REGISTER WORKER\n3-CALCULE INCOME\n4-LIST DEPARTAMENT\n5-EXIT");
				System.out.println("**SYSWORKER - 1.0a**");
				option = sc.nextInt();

				// REGISTER DEPARTAMENT
				if (option == 1) {
					department = new Department();
					// Get next id
					if (!departamentRepository.isEmpty()) {
						int max = departamentRepository.stream().mapToInt(item -> item.getId()).max()
								.orElseThrow(() -> new Exception("No max number found!"));
						department.setId(++max);
					} else
						department.setId(1);

					System.out.print("Enter departament name: [EX: stock] ");
					department.setName(sc.next());
					if (department.getName().length() == 0)
						throw new Exception("Departament is required");
					departamentRepository.add(department);
					// REGISTER WORKER
				} else if (option == 2) {

					if (Objects.isNull(department))
						throw new Exception("No department registered");

					worker = new Worker();
					System.out.print("Enter with name of worker: [EX: BOB] ");
					worker.setName(sc.next());

					// Check duplicate
					if (!workersRepository.isEmpty()) {
						for (Worker item : workersRepository) {
							if (item.getName().trim().equals(worker.getName())) {
								System.out.println("Name [" + item.getName().toUpperCase() + "] exists!");
								main(args);
							}
						}
					}

					System.out.print("Enter with Level of worker: [JUNIOR,MID_LEVEL,SENIOR] ");
					String level = sc.next();
					worker.setLevel(WorkLevel.valueOf(level.toUpperCase()));
					System.out.print("Enter with Base Salary of worker: [EX: 1200.00] ");
					worker.setBaseSalary(new BigDecimal(sc.nextDouble()));
					worker.setDepartment(department);

					System.out.print("How many contracts to this worker? :");
					int qtdContracts = sc.nextInt();
					if (qtdContracts <= 0)
						throw new Exception("Select first qtde of contracts!");

					for (int i = 1; i <= qtdContracts; i++) {
						System.out.print("Enter contract #" + i + " data: \n");
						hourContract = new HourContract();
						System.out.print("Date: [dd/MM/yyyy] ");
						hourContract.setDate(sdf.parse(sc.next()));
						System.out.print("Value per hours [Ex: 12.00] :");
						hourContract.setValuePerHour(new BigDecimal(sc.nextDouble()));
						System.out.print("Duration (hours) [Ex: 18] :");
						hourContract.setHours(Integer.valueOf(sc.nextInt()));
						worker.addContract(hourContract);
					}
					workersRepository.add(worker);

				} // INCOME
				else if (option == 3) {
					System.out.println("Enter MONTH and YEAR to calculate income (MM/YYYY): ");
					String monthAndYear = sc.next();
					Integer month = Integer.parseInt(monthAndYear.split("/")[0]);
					Integer year = Integer.parseInt(monthAndYear.split("/")[1]);

				} else if (option == 4) {
					System.out.println("**BEGIN REPORT - SYSWORKER - 1.0a - List of Departaments**");
					departamentRepository.forEach(item -> {
						System.out.println("Id: " + item.getId() + "\nName:  " + item.getName());
					});
					System.out.println("**END REPORT - SYSWORKER - 1.0a**\n\n");

					if (departamentRepository.isEmpty())
						System.out.println("No department registered!");

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

}
