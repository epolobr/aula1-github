import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Entre com o número do funcionário: ");
		int number = sc.nextInt();
		System.out.println("Informe a quantidade de horas: ");
		double hours = sc.nextDouble();
		System.out.println("Informe o valor da hora trabalhada: ");
		double valorHours = sc.nextDouble();
		
		double salario = hours * valorHours;
		
		System.out.println("Number: " + number);
		System.out.printf("Salário: U$ %.2f%n", salario);
		
		sc.close();

	}

}
