package estrutura_repetitivas;

import java.util.Scanner;

public class WhileTesteSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int valor = sc.nextInt();
		
		while (valor != senha) {
			System.out.println("Senha Inválida");
			valor = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		

	}

}
