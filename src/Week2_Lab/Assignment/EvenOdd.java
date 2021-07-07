package Week2_Lab.Assignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number:");
		int num = scan.nextInt();
		if (num%2 == 0)
			System.out.println(num+" is Even");
		else 
			System.out.println(num+" is odd");
	}

}
