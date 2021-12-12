package estrutura_condicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Número Par");
		}
		else {
			System.out.println("Impar");
		}
		
		sc.close();

	}

}
