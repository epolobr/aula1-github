import java.util.Scanner;

public class Exercico03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor: ");
		int a = sc.nextInt();
		System.out.println("Entre com o segundo valor: ");
		int b = sc.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		int c = sc.nextInt();
		System.out.println("Entre com o quarto valor: ");
		int d = sc.nextInt();
		
		int diferenca = (a * b) - (c * d);
		
		System.out.println("Diferença: " + diferenca);
		
		sc.close();
	}

}
