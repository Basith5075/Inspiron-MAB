package Week2_Lab.Assignment;

import java.util.Scanner;

public class Vowel {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please Enter a character to know if its a vowel");
			char ch = scan.next().charAt(0);
			System.out.println();
			if(ch=='a'|| ch=='e'|| ch== 'i'|| ch == 'o'|| ch=='u')
				System.out.println("Entered character is a vowel");
			else 
				System.out.println("Entered character is not a vowel");
}
	
}
