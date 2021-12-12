package topicos_basicos;

public class WorkSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "potate apple lemon";
		
		String[] vect = s.split(" ");
		
		String vect1 = vect[0];
		String vect2 = vect[1];
		String vect3 = vect[2];
		
		System.out.println(vect1);
		System.out.println(vect2);
		System.out.println(vect3);

	}

}
