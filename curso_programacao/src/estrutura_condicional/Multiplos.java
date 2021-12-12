package estrutura_condicional;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}

}
