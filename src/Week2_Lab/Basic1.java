package Week2_Lab;

import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter First number to multiply: ");
		int num1 = scan.nextInt();
		System.out.println("Please enter Second Number to multiply: ");
		int num2 = scan.nextInt();
		System.out.println("Multiplication result of two num is = "+(num1*num2));
		scan.close();
	}

}
