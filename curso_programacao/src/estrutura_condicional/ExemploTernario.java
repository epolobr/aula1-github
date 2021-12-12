package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ExemploTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 01 : preco * 0.05;
		
		System.out.printf("%.2f%n", desconto);		
		
		sc.close();

	}

}
