package application; 
// video https://www.youtube.com/watch?v=Xj-osdBe3TE

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramExercicio {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<Employee>();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #"  + (i + 1) +  ": " );
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
			System.out.println("");

		}  	      
		
		sc.close();
		
	}
}