import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String ax;
		ax = sc.next();
		System.out.println("Você digitou " + ax);

		int ac;
		ac = sc.nextInt();
		System.out.println("Você digitou. " + ac);

		double ab;
		ab = sc.nextDouble();
		System.out.println("Você digitou.." + ab);

		char cr;
		cr = sc.next().charAt(0);
		System.out.println("Você digitou..." + cr);

		String a;
		int b;
		double z;

		a = sc.next();
		b = sc.nextInt();
		z = sc.nextDouble();

		sc.close();
		
		System.out.println("Dados digitados: ");

		System.out.println(a);
		System.out.println(b);
		System.out.println(z);

	}

}
