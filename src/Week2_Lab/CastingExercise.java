package Week2_Lab;

public class CastingExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 10;
		byte b = 10;
		int c = a; // Type promotion -- Byte to int
		int e = a*b;
		//byte d = a*b;
		byte d = (byte) e; // Type Casting -- int to byte
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		System.out.println("The value of c = "+c);
		System.out.println("The value of d = "+d);
		System.out.println("The value of e = "+e);
		
		int i = 158;
		double j = i;
		// int k = j; We need type casting in this scenario.
		int k = (int) j;
		System.out.println("value of i = "+i);
		System.out.println("value of j = "+j);
		System.out.println("value of k = "+k);	
	}

}
