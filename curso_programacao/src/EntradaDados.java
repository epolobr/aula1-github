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
		System.out.println("Voc� digitou: " + x);	
		
		i = sc.nextInt();
		System.out.println("Voc� digitou: " + i);	
		
		y = sc.nextDouble();
		System.out.println("Voc� digitou: " + y);
		System.out.printf("Voc� digitou: %.2f%n", y);
		
		p = sc.next().charAt(0);
		System.out.printf("Voc� digitou: " + p);
		
		sc.close();
	}

}
