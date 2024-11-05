import java.util.Locale;
import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0 , out = 0;
		
		
		for (int i=0; i<N; i++) {
			
		int digitoUsuario = sc.nextInt();
		
		if(digitoUsuario >= 10 && digitoUsuario <=20) {
			in += 1;
		}
		else {
			out += 1;
		}
			
		}
		
		System.out.printf("%d in%n%d out", in, out);
		
		
		
		sc.close();
	}

}
