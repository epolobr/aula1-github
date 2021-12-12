package entities;

public class Student {
	public String name;
	public double n1, n2, n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public double falta() {
		return 100 - (n1 + n2 + n3);
	}
	
	public String toString() {
		if (finalGrade() >= 60.0) {
			return "Final Grade: "
					+ String.format("%.2f%n", finalGrade())
					+ "PASS";
		}
		else {
			return "Final Grade: "
					+ String.format("%.2f%n", finalGrade())
					+ "FAILED \r\n"
					+ "MISSING "
					+ falta()
					+ " POINTS";
					
		}
	}
}
