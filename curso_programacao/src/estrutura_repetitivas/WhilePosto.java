package estrutura_repetitivas;

import java.util.Scanner;

public class WhilePosto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		
		int fim = sc.nextInt();
		
		while (fim != 4) {
			switch(fim) {
			   case 1:
				   Alcool = Alcool + 1;
				   break;
			   case 2:
				   Gasolina = Gasolina + 1;
				   break;
			   case 3:
				   Diesel = Diesel + 1;
				   break;
			   default:
				   System.out.println("");
			   	   
			}
			
			System.out.println("Alcool = " + Alcool);
			System.out.println("Gasolina = " + Gasolina);
			System.out.println("Diesel = " + Diesel);
						
			fim = sc.nextInt();
			
		}
		System.out.println("Muito obrigado");
		
		sc.close(); 

	}

}
