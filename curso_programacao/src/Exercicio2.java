import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Entre com o segundo valor: ");
		int valor2 = sc.nextInt();
		
		int total = valor1 + valor2;
		
		System.out.println ("Soma = " + total);
		
		sc.close();
		
		
	}

}
