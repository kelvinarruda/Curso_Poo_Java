import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String a1 , b1, z1;
		//Somente usar se houver um next que não seja nextline antes as variaveis. Devido a buffer.
		//sc.nextLine();
		
		a1 = sc.nextLine();
		b1 = sc.nextLine();
		z1 = sc.nextLine();
		
		System.out.println("Dados digitados: ");

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(z1);

		
		sc.close();


	}

}
