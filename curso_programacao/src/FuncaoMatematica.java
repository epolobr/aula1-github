
public class FuncaoMatematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + a);
		System.out.println("Raiz quadrada de " + z + " = " + b);
		System.out.println("Raiz quadrada de 25  = " + c);
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		
		System.out.println();
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado ao quadrado = "  + b);
		System.out.println("5 elevado ao quadrado = " + c);
		
		a = Math.abs(x);
		b = Math.abs(y);
		c = Math.abs(z);
		
		System.out.println();
		System.out.println("Valor absoluto de " + x + " = " + a);
		System.out.println("Raiz absoluto de " + y + " = " + b);
		System.out.println("Raiz absoluto de " + z + " = " + c);
		
	}

}
