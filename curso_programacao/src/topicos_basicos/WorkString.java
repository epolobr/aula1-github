package topicos_basicos;

import java.util.Scanner;

public class WorkString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String original = sc.nextLine();
		String minuscula = original.toLowerCase();
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("toLowerCase: " + "**" + minuscula + "**");
		
		System.out.println("");
		
		String maiuscula = original.toUpperCase();
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("toUpperCase: " + "**" + maiuscula + "**");
		
		System.out.println("");
		
		String espaco = original.trim();
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("Trim: " + "**" + espaco + "**");
		
		System.out.println("");
		
		String corte = original.substring(2);
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("Corte: " + "**" + corte + "**");
		
		System.out.println("");
		
		String corte1 = original.substring(2, 9);
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("Corte1: " + "**" + corte1 + "**");
		
		System.out.println("");
		
		String Troca = original.replace("a", "%");
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("Troca: " + "**" + Troca + "**");
		
		System.out.println("");
		
		String Troca1 = original.replace("Evandro", "%");
		System.out.println("Original: " + "**" + original + "**");
		System.out.println("Troca1: " + "**" + Troca1 + "**");
		
		
		int of = original.indexOf("dro");
		int last = original.lastIndexOf("dro");
		System.out.println("of: " + "**" + of + "**");
		System.out.println("last: " + "**" + last + "**");
		System.out.println("");
		sc.close();
	}

}
