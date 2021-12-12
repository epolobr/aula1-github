package application;

import java.util.Locale;
import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vect[i];
		}
		soma = soma /n;
		System.out.printf("Valor da media é %.2f%n", soma);
		
		sc.close();
	}

}
