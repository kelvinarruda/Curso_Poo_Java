import java.util.Locale;
import java.util.Scanner;

public class exec5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		int codPeca1, codPeca2, quantPeca1, quantPeca2;
		double vlrUnitario1, vlrUnitario2, vlrTotalPagar; 
		
		codPeca1 = sc.nextInt();
		quantPeca1 = sc.nextInt();
		vlrUnitario1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		quantPeca2 = sc.nextInt();
		vlrUnitario2 = sc.nextDouble();
		
		vlrTotalPagar = (quantPeca1 * vlrUnitario1) + (quantPeca2 * vlrUnitario2);
		
		System.out.printf("VALOR A PAGAR. R$ %.2f", vlrTotalPagar);
		
	}

}
