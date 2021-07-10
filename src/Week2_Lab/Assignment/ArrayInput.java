package Week2_Lab.Assignment;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int num:array) {
			sum = sum+num;
		}
		System.out.println("The sum of array elements is ="+sum);
	}
	

}
