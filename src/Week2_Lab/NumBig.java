package Week2_Lab;

import java.util.Scanner;

public class NumBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter N1 ");
		int n1 = scan.nextInt();
		System.out.println("Please Enter N2 ");
		int n2 = scan.nextInt();
		String res = (n1>n2)?(n1+" is bigger"):(n2+" is bigger");
		System.out.println(res);
		scan.close();
	}

}
