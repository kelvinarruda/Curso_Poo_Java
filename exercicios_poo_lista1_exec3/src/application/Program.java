package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirtGrade = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()) );
		
		if (student.finalGrade() >= 60 ) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.print("MISSING " + String.format("%.2f", student.missingGrade(student.finalGrade())) + " POINTS");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
