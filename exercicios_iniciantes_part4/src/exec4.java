import java.util.Locale;
import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num1=0, num2=0;
		
		for(int i=0; i<N; i++) {
			
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num2 == 0 ) {
			System.out.println("divisao impossivel");
		}
		else {
			double resul = (double) num1 / num2;
			System.out.println(resul);
			}
	
		}
		
		sc.close();
	}

}
