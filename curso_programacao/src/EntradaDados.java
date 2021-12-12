import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x;
		int i;
		double y;
		char p;
		
		x = sc.next();
		System.out.println("Você digitou: " + x);	
		
		i = sc.nextInt();
		System.out.println("Você digitou: " + i);	
		
		y = sc.nextDouble();
		System.out.println("Você digitou: " + y);
		System.out.printf("Você digitou: %.2f%n", y);
		
		p = sc.next().charAt(0);
		System.out.printf("Você digitou: " + p);
		
		sc.close();
	}

}
