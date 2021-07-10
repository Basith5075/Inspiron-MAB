package Week2_Lab.Assignment;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("Please Enter length of the rectange: ");
		double length = scan.nextDouble();
		System.out.println("Please Enter Width of the rectange: ");
		double width = scan.nextDouble();
		double area = length*width;
		System.out.println("Area of the rectange is = "+area);
		System.out.println("Do You want to continue. If yes press 1 or else enter any thing");
		choice =scan.nextInt();
		}while(choice==1);
		System.out.println("Thanks for using my App !!");
	}

}
