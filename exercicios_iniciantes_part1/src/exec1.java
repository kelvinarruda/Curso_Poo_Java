import java.util.Locale;
import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		//mensagem explicativa, conforme exemplos.
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int resul = a + b;
		
		
		System.out.println("SOMA: " + resul);
		
		sc.close();
	}

}
