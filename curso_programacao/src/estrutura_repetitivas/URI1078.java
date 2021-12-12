package estrutura_repetitivas;

import java.util.Scanner;

public class URI1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i < 11; i++)
			System.out.println(i + " X " + N + " = " + (i*N));
			
		sc.close();

	}

}
