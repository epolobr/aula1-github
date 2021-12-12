package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class WhileExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		int idade = 0;
		double media = 0;
		int contador = 0;
		
		Scanner sc = new Scanner (System.in);
		idade = sc.nextInt();
		
		 /* if (idade > 0) {
			while (idade > 0) {
				media = media + idade;
				contador = contador + 1;
				idade = sc.nextInt();
			}
			
		}
		else {
			System.out.println("Imossivel calcular");
			return;
		}
		
		System.out.printf("Média = %.2f%n", media / contador); */
		
		while (idade > 0) {
			media = media + idade;
			contador = contador + 1;
			idade = sc.nextInt();
		}
		
		if (contador > 0 ) {
			System.out.printf("Média = %.2f%n", media / contador);
		}
		else {
			System.out.println("Imossivel calcular");
		}
		
				
	    sc.close();

	}

}
