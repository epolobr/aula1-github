package estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informe um número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("Número negativo");
		} 
		else {
			System.out.println("Número positivo");
		}
			
				
		sc.close();

	}

}
