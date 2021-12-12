import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencialExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.youtube.com/watch?v=Ah1Y6d6deq0
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o largura: ");
	    double largura = sc.nextDouble();
	    System.out.println("Informe o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Informe o valor: ");
		double valor = sc.nextDouble();
		
		
		double area = largura * comprimento;
		
		double total = area * valor;
		
		System.out.printf("Total da area: %.2f%n", area);
		System.out.printf("Valor total da area %.2f%n10", total);
		
		
		sc.close();
		

	}

}
