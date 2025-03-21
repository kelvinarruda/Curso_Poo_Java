package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.salary= sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary() ));
		
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
				
		employee.increaseSalary(percent);
		
		System.out.println("Updated data: " + employee.name + ", $ " + employee.salary);
		
		
		
		sc.close();
	}

}
