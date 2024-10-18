import java.util.Locale;
import java.util.Scanner;

public class exec5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codProduto, quantidadeProduto;
		double total;
		
		codProduto = sc.nextInt();
		quantidadeProduto = sc.nextInt();
		
		
		if (codProduto == 1) {
			total = quantidadeProduto * 4.00;

		}
		else if (codProduto == 2) {
			total = quantidadeProduto * 4.50;
			
		}
		else if (codProduto == 3) {
			total = quantidadeProduto * 5.00;
			
		}
		else if (codProduto == 4) {
			total = quantidadeProduto * 2.00;
			
		}
		else {
			total = quantidadeProduto * 1.50;
			
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
