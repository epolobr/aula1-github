package estrutura_condicional;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number >= 0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();

	}

}
