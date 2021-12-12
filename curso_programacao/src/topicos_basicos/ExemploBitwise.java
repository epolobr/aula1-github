package topicos_basicos;

import java.util.Scanner;

public class ExemploBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 89;
		int z = 60;
		
		System.out.println(i & z);   //Verdadeiro === ambas tem que ser verdadeira
		System.out.println(i | z);	 //Verdadeiro === quando uma é verdadeira
		System.out.println(i ^ z);	 //Verdadeiro ==+ quando um for verdadeira.
		
		//Testar o sexto bit
		
		Scanner sc = new Scanner (System.in);
		
		int mask = 0b00100000;
		int n  = sc.nextInt();
				
		if ((n & mask) !=0) {
			System.out.println("6th bit is true!!");
		}
		else {
			System.out.println("6th bit is false!!");
		}
		sc.close();
	}

}
