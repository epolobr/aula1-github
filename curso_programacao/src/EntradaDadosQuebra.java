import java.util.Scanner;

public class EntradaDadosQuebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		String a, b, c;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.nextLine();
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		
		
		System.out.println("Você digitou para a variavel a: " + a);
		System.out.println("Você digitou para a variavel b: " + b);
		System.out.println("Você digitou para a variavel c: " + c);
		System.out.println("Você digitou para a variavel x: " + x);
			
		sc.close();
	}

}
