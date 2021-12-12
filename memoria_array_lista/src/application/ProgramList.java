package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		list.add(2, "Marco");
		list.add(0, "Fernando");
		
		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("--------------------------");
		
		System.out.println(list.size());
		
		list.remove("Anna");
		
		System.out.println("--------------------------");
		
		list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Index of: " + list.indexOf("Bob"));
	
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(result);
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("Não encontrado");
		System.out.println(name1);
	}

}
