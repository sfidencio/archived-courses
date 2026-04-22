package employees;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import employees.entities.Employee;

/**
 * @author Sebastiao Fidencio
 * 		   Fazer um programa para ler um número inteiro N e depois os
 *         dados (id, nome e salario) de N funcionários. Não deve haver
 *         repetição de id. Em seguida, efetuar o aumento de X por cento no
 *         salário de um determinado funcionário. Para isso, o programa deve ler
 *         um id e o valor X. Se o id informado não existir, mostrar uma
 *         mensagem e abortar a operação. Ao final, mostrar a listagem
 *         atualizada dos funcionários, conforme exemplos. Lembre-se de aplicar
 *         a técnica de encapsulamento para não permitir que o salário possa ser
 *         mudado livremente. Um salário só pode ser aumentado com base em uma
 *         operação de aumento por porcentagem dada. (exemplo na próxima página)
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>(0);
		try {
			System.out.print("Enter the number of employees:");
			int n1 = sc.nextInt();
			System.out.println("");
			if (n1 == 0)
				throw new Exception("Quantity cannot be equal to zero.");
			for (int i = 0; i < n1; i++) {
				System.out.print("Enter the employee's id: ");
				Long id = sc.nextLong();

				// Check duplicity id
				Boolean isExist = employees.stream().filter(e -> e.getId().equals(id)).findFirst().isPresent();
				if (isExist) {
					System.out.println("Employee already exists for the selected id");
					--i;
					continue;
				}

				System.out.print("Enter the employee's name: ");
				String name = sc.next();
				System.out.print("Enter the employee's salary: ");
				BigDecimal salary = sc.nextBigDecimal();
				employees.add(new Employee(id, name, salary));
				System.out.println("");
			}

			// Adjust salary emproyee.
			System.out.print("Enter the employee id that will have salary increase: ");
			Long searchedId = sc.nextLong();
			Optional<Employee> employeeFound = employees.stream().filter(e -> e.getId().equals(searchedId)).findFirst();
			if (!employeeFound.isPresent()) {
				System.out.println("Employee not found");
				employees.forEach(item -> {
					System.out.println(item);
				});
				System.exit(0);
			}
			// throw new Exception("Employee not found");
			System.out.print("Enter the percentage: ");
			BigDecimal percent = sc.nextBigDecimal();
			if (percent.doubleValue() == 0)
				throw new Exception("Percent cannot be zero");
			employeeFound.get().setId(searchedId);
			employeeFound.get().adjustSalary(percent);
			System.out.println("List of Employees: ");
			employees.forEach(item -> {
				if (item.equals(employeeFound)) // Equals and Hashcode implemeted
					item = employeeFound.get();
				System.out.println(item);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
