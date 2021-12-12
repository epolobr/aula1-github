package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (a == 0 || delta <= 0) {
			System.out.println("Impossivel calcular");
		}
		
		double r1 = (-b - Math.sqrt(delta)) / (2 * a);
		double r2 = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("R1 = %.5f%n", r1);
		System.out.printf("R2 = %.5f%n", r2);
	
		sc.close();

	}

}
