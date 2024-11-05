import java.util.Locale;
import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool=0, gasolina=0, diesel=0;
		int digitoUsuario = sc.nextInt();
		
		while(digitoUsuario != 4) {
			switch (digitoUsuario) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
			default:
				break;
			}
			
			digitoUsuario = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
		
		sc.close();
	}

}
