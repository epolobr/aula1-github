package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Medinotaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com as duas notas: ");
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double notaFinal = n1 + n2;
		
		if (notaFinal < 60.0) {
			System.out.printf("Nota final: %.1f%n", notaFinal);
			System.out.println("Reprovado");
		}
		else {
			System.out.printf("Nota final: %.1f%n", notaFinal);
		}
		
		sc.close();
	}

}
