package estrutura_repetitivas;

import java.util.Scanner;

public class WhileURI1113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if (x > y) {
				System.out.println(x + " " + y + " Decrescente");
			}
			else {
				System.out.println(x + " " + y + " Crescente");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();		

	}

}
