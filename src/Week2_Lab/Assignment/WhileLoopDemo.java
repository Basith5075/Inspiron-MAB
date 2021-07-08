package Week2_Lab.Assignment;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number Till where you want to add");
		int num = scan.nextInt();
		int sum=0;
		int counter =0;
		while(counter<=num) {
			sum=counter+sum;
			counter++;
		}
		
		System.out.format("The sum of numbers till %d is = %d ",num,sum);
	}

}
