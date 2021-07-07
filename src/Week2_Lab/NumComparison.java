package Week2_Lab;

import java.util.Scanner;

public class NumComparison {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		int n1 = scan.nextInt();
		System.out.println("Please enter Second number:");
		int n2 = scan.nextInt();
		System.out.println("Please enter Third number:");
		int n3 = scan.nextInt();
		if((n1>n2)&&(n1>n3))
			System.out.println(n1 + " is biggest");
		else if((n2>n1)&&(n2>n3))
			System.out.println(n2 + " is biggest");
		else 
			System.out.println(n3 + " is biggest");
		scan.close();
	}

}
