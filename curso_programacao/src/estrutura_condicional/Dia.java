package estrutura_condicional;

import java.util.Scanner;

public class Dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informa a hora: ");
		
		int hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
		
		sc.close();
		

	}

}
