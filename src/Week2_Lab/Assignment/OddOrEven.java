package Week2_Lab.Assignment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number to Know it is odd or even : ");
		int num= scan.nextInt();
		if (num % 2 == 0)
			System.out.println("Number is Even");
		else 
			System.out.println("Number is Odd");
		
		// Using Terniary operators
		System.out.println("The Entered number is "+((num % 2 == 0) ? ("Even"):("Odd")));

	}

}
