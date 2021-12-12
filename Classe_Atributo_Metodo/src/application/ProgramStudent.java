package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Student st = new Student();
		System.out.print("Name student: ");
		st.name = sc.nextLine();
		
		System.out.println("Enter student grades: ");
		st.n1 = sc.nextDouble();
		st.n2 = sc.nextDouble();
		st.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(st.toString());
		sc.close();

	}

}
