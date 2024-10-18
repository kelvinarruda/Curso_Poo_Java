import java.util.Locale;
import java.util.Scanner;

public class exec6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		//mostre: 
		//a) a área do triângulo retângulo que tem A por base e C por altura. 
		//b) a área do círculo de raio C. (pi = 3.14159) 
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		//d) a área do quadrado que tem lado B. 
		//e) a área do retângulo que tem lados A e B.
		
		double A, B, C, areaDoTriangulo,areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaDoTriangulo = (A * C)/2;
		areaDoCirculo = 3.14159 * (C * C);
		areaDoTrapezio = ((A+B) * C)/2;
		areaDoQuadrado = (B*B);
		areaDoRetangulo = (A*B);
		
		System.out.printf("TRIANGULO = %.3f%nCIRCULO = %.3f%nTRAPEZIO = %.3f%nQUADRADO = %.3f%nRETANGULO = %.3f", areaDoTriangulo,areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo);
		
		sc.close();
	}

}
