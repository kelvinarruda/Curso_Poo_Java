import java.util.Locale;
import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double a=0, b=0, c=0;		
		int pesoA=2, pesoB=3, pesoC=5;
		
		
		for(int i=0; i<N; i++) {
			
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			double resul = ((a * pesoA) + (b * pesoB) + (c * pesoC)) / (pesoA+pesoB+pesoC);

			System.out.printf("%.1f%n", resul);
		}
		
		
		
		
		sc.close();
	}

}
