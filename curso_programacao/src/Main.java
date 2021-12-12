import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Author: Evandro Polo - Primeiro programa
		
		System.out.println("Olá Mundo!!!");
		System.out.println("Bom dia!!!");
		System.out.print("Boa tarde!!!");
		System.out.print("Boa noite!!!");
		
		int y = 32;
		System.out.println();
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		
		System.out.printf("%.2f\n", x);
		System.out.printf("%.3f\n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n", x);
		
		System.out.println("Resultado: " + x + " metros");
		System.out.printf ("Resultado: %.3f metros\n", x);
		
		String nome = "Maria";
		int idade = 25;
		double renda = 4000.00;
		System.out.printf("%s tem %d e ganha RS %.2f reais\n", nome, idade, renda);

	}

}
