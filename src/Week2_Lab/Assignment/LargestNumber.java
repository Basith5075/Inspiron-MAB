package Week2_Lab.Assignment;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease Enter First Number");
		int n1 = scan.nextInt();
		System.out.println("Please Enter Second Number");
		int n2 = scan.nextInt();
		System.out.println("Please Enter Third Number");
		int n3 = scan.nextInt();
		
		if(n1>n2 && n1>n3)
			System.out.println(n1+" is the biggest number");
		else if (n2>n1 && n2>n3)
			System.out.println(n2+ " is the biggest number");
		else 
			System.out.println(n3 + " is the biggest");
		
	}

}
