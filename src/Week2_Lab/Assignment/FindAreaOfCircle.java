package Week2_Lab.Assignment;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter radius of circle:");
		double radius = scan.nextDouble();
		
		double area = Math.PI*radius*radius;
		System.out.println("Area of circle = "+area);
		
		double circumference = Math.PI*2*radius;
		System.out.println("Circumference of circle = "+circumference);

	}

}
