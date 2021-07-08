package Week2_Lab.Assignment;

import java.util.Scanner; 
class FloydsTriangle1 
 { 
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the size of rows for Floyds Triangle");
		int row = scan.nextInt();
		int counter =1;
		System.out.println("Floyd's Triangle");
		System.out.println("****************");
		for(int i=1; i<=row;i++ )
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print((counter++)+" ");
			}
			System.out.println();
		}
		
	}
}