package Week2_Lab.Assignment;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// area of triangle == 1/2(	base * height )
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the base of trianlge");
		double base = scan.nextDouble();
		
		System.out.println("Please enter the height of trianlge");
		double height = scan.nextDouble();
		
		double area =(base*height)/2;
		System.out.println("Area of Triangle = "+area);
	}
	
}
