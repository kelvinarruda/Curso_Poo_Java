import java.util.Locale;
import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raioCirculo = sc.nextDouble();
		double formArea = 3.14159 * (raioCirculo*raioCirculo);
		
		System.out.printf("A=%.4f", formArea);

		sc.close();
	}

}
