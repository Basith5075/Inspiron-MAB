package Week2_Lab.Assignment;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 152.25f;
		float b = 15.52f;
		System.out.println("********Before Swap *********");
		System.out.println("The values of a is =  " + a);
		System.out.println("The values of b is = " + b);
		
		// Swapping two numbers
		
		a = b+a;
		b = a-b;
		a = a-b;
		System.out.println("********After Swap *********");
		System.out.println("The swapped values of a is =  " + a);
		System.out.println("The swapped values of b is = " + b);
		
		
	}

}
