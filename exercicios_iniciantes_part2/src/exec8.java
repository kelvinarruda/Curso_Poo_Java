import java.util.Locale;
import java.util.Scanner;

public class exec8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto=0.00;
		
		salario = sc.nextDouble();
		
		if(salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
			
		}
		else if(salario > 2000.00 && salario <= 3000.00) {
			imposto = (salario - 2000) * 8 / 100; 
		}
		
		else if(salario > 3000.00 && salario <= 4500.00) {
			imposto = ((salario - 3000) * 18 / 100) + (1000 * 8 / 100); 
		}
		else {
			imposto = ((salario - 4500) * 28 / 100) + (1500 * 18 / 100) + (1000 * 8 / 100);  
		}
		
		if(imposto != 0.00) {
			System.out.printf("R$ %.2f",imposto);
		}
		
		
		sc.close();
	}

}
