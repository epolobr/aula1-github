package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		char resp = sc.next().charAt(0);
		do {
			System.out.print("Digite a temperatura em Celsius = ");
			double c = sc.nextDouble();
			double valor = 9*c / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit = %.2f%n", valor);
			System.out.println("Deseja continuar? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n' || resp != 'N');
		
		
		sc.close();

	}

}
