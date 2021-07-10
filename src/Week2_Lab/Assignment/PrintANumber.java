package Week2_Lab.Assignment;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number to display:");
		int num = scan.nextInt();
		System.out.println("The Entered Number is = "+num);
		scan.close();
	}

}
