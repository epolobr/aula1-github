package estrutura_repetitivas;

import java.util.Scanner;

public class CondicaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println("Valor total de x = " + soma);
		
		sc.close();
		

	}

}
