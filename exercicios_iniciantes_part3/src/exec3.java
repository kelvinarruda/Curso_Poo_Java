import java.util.Locale;
import java.util.Scanner;

public class exec3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x , y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}
			else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			
			
		}
		
		
		sc.close();
	}

}
