import java.util.Locale;
import java.util.Scanner;

public class exec4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int tempoDeJogo;
		
		if (horaInicial == horaFinal ) {
			tempoDeJogo = 24;
			System.out.printf("O JOGO DUROU %d HORA(S)",tempoDeJogo);
		}
		else if (horaInicial > horaFinal) {
			tempoDeJogo = 24 - horaInicial + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempoDeJogo);
		}
		
		else {
			tempoDeJogo = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", tempoDeJogo);
		}
		
		sc.close();
	}

}
