import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que: 1-leia o número de um funcionário, 2-seu número de
		 * horas trabalhadas, 3-o valor que recebe por hora e; 4-calcula o salário desse
		 * funcionário. 5-A seguir, mostre; 6-o número e o; 7-salário do funcionário,
		 * com duas casas decimais.
		 */

		Locale.setDefault(Locale.US);//Troca virgula pelo ponto.
		int employeeNumber;
		double employeeWorkedHours = 0d; // Horas Trabalhadas
		double employeeValueReceivedPerHour = 0d; // Valor Recebido por Hora
		double employeeSalaryCalculed = 0d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number: ");
		employeeNumber = sc.nextInt();
		System.out.println("Enter with number of hours worked: ");
		employeeWorkedHours = sc.nextDouble();
		System.out.println("Enter with amount received per hour worked: ");
		employeeValueReceivedPerHour = sc.nextDouble();
		employeeSalaryCalculed = employeeWorkedHours * employeeValueReceivedPerHour;
		System.out.println("SALARY CALCULED: ");
		System.out.println("NUMBER: " + employeeNumber);
		System.out.printf("SALARY: U$ %.2f%n", employeeSalaryCalculed);

	}

}
