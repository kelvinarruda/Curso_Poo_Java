import java.util.Locale;
import java.util.Scanner;

public class exec7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double numeroEntrada1, numeroEntrada2;
		
		numeroEntrada1 = sc.nextDouble();
		numeroEntrada2 = sc.nextDouble();
		
		if (numeroEntrada1 == 0 && numeroEntrada2 != 0) {
			System.out.println("Eixo Y");
		}
		else if(numeroEntrada1 != 0 && numeroEntrada2 == 0) {
			System.out.println("Eixo X");
		}
		else if(numeroEntrada1 > 0 && numeroEntrada2 > 0) {
			System.out.println("Q1");
		}
		else if(numeroEntrada1 < 0 && numeroEntrada2 > 0) {
			System.out.println("Q2");
		}
		else if(numeroEntrada1 < 0 && numeroEntrada2 < 0) {
			System.out.println("Q3");
		}
		else if(numeroEntrada1 > 0 && numeroEntrada2 < 0){
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}
		
		
		
		
		sc.close();
	}

}
