import java.util.Locale;
import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFunc;
		double horaTrab,vlrTrab, salarioRecebido;
		
		numeroFunc = sc.nextInt();
		horaTrab = sc.nextDouble();
		vlrTrab = sc.nextDouble();
		
		salarioRecebido = horaTrab * vlrTrab;
		
		System.out.printf("NUMBER = %d%nSALARY: U$ %.2f", numeroFunc , salarioRecebido);
		

	}

}
