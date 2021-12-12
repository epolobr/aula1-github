package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductSobreCarga;

public class ProgramSobreCarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		String name = sc.nextLine();
		
		System.out.println("Informe o valor do produto; ");
		double price = sc.nextDouble();
		
		ProductSobreCarga product = new ProductSobreCarga();
		
		product.setName("Computador");
		
		System.out.println(product.getName());
		
		
		sc.close();

	}

}
