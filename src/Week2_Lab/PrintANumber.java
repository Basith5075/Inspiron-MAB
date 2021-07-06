package Week2_Lab;

import java.util.Scanner;

public class PrintANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner is a classed present in java.util package, which contains nextInt() method which reads the next integer from the keyboard
		 * System is a class present in java.lang package which contains public static final PrintStream out. 
		 * PrintStream class contains the println method
		 *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number to display:");
		int num = scan.nextInt();
		System.out.println("The Entered Number is = "+num);
		scan.close();
	}

}
