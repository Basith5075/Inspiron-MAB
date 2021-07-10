package Week2_Lab.Assignment;

public class SwapTwoNumbersExercise1 {
		public static void main(String[] args) {
			
			float first = 2.50f, second = 4.50f;
			System.out.println("--Before swap--");
			System.out.println("First number = " + first);
			System.out.println("Second number = " + second);
			
			// Value of first is assigned to temporary
			float temporary = first;
			// Value of second is assigned to first
			first = second;
						
			System.out.println("--After swap--");
			System.out.println("First number = " + first);
			System.out.println("Second number = " + second);
}
}