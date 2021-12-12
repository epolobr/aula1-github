package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class VendaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codigo = sc.nextInt();
		int qdtade = sc.nextInt();
		double total = 0;
		
		if (codigo == 1) {
			total = qdtade * 4.0;
		}
		else if (codigo == 2) {
			total = qdtade * 4.5;
		}
		else if (codigo == 3) {
			total = qdtade * 5.0;
		}
		else if (codigo == 4) {
			total = qdtade * 2.0;
		}
		else if (codigo == 5) {
			total = qdtade * 1.5;
		}
		else {
			
			
		}
		
		if (total != 0) {
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else {
			System.out.println("Códgio inválido");
		}
		
		sc.close();

	}

}
