package entities;

public class Student {

	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirtGrade;
	
	
	public double finalGrade() {
		return firstGrade + secondGrade + thirtGrade;
	}
	
	
	public double missingGrade(double score) {
		if (score < 60.00) {
			return 60 - finalGrade();
		}
		else {
			return 0;
		}
	}
	
}
