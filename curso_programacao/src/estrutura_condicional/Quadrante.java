package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		String saida;
		
		if (x == 0 && y == 0) {
			saida = "Origem";
		}
		else if (x > 0 && y > 0) {
			saida = "Q1";
		} else if  (x > 0 && y < 0 ) {
			saida = "Q4";
		} else if (x < 0 && y < 0){
			saida = "Q3";	
		} else {
			saida = "Q2";
		}
		
		System.out.println(saida);
		sc.close();

	}

}
