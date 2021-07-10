package Week2_Lab.Assignment;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		
		String choice="Yes";
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the side of the square");
		double side = Double.parseDouble(scan.nextLine());
		double area = side*side;
		System.out.println("Area of Square = "+area);
		System.out.println("Do you want to continue: If yes enter Yes or enter any other input");
		choice = scan.nextLine();
		}while(choice.equals("Yes"));
		System.out.println("Thanks for using my App");
	}

}
