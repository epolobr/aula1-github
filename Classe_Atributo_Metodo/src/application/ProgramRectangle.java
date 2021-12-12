package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		
		Rectangle rec = new Rectangle();
		System.out.println("Enter rectangle width and height: ");		
		rec.Width = sc.nextDouble();
		rec.Height = sc.nextDouble();
		
		System.out.printf("AREA = %.6f%n", rec.area());
		System.out.printf("PERIMETER = %.6f%n", rec.perimeter());
		System.out.printf("DIAGONAL = %.6f%n", rec.diagonal());
		
		sc.close();

	}

}
