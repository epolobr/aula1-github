import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double delta, a, b, c, x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b,2) - 4 * a * c;
		
		x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("Resultado de x1: " + x1 + " x2: " + x2);
		
		sc.close();

	}

}
