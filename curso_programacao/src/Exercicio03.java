import java.util.Locale;
import java.util.Scanner;


public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
