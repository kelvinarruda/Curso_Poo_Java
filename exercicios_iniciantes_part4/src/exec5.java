import java.util.Locale;
import java.util.Scanner;

public class exec5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int resul = N;
		
		if (N == 0) {
			 resul = 1;
			
			System.out.println(resul);
		}
		else {
			
			for (int i=(N-1); i>=1; i--) {
			 resul = resul * i;
			}
			
			System.out.println(resul);
		}
		
	
		sc.close();

	}

}
