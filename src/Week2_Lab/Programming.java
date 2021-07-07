package Week2_Lab;

import java.util.Scanner;

public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Single value");
		int n = scan.nextInt();
	
		switch(n) {
		case 100:{
			System.out.println("Entered Number is 100");
			break;
		}
		case 200 :{
			System.out.println("Entered num is 200");
			break;
		}
		default: 
			System.out.println("Number is not in the range");
			
		}
		}
	}

