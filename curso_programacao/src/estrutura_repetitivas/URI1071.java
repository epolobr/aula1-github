package estrutura_repetitivas;

import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min, max;
		int soma = 0;
		
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			max = x;
			min = y;
		}
		
		for(min=min+1; min < max; min++) {
			if (min % 2 != 0) {
				soma = soma + min;
			}			
		}
		System.out.println(soma);		
		sc.close();
	}

}
