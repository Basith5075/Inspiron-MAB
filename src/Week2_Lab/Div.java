import java.util.Scanner;
class Div 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		try{
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The div is = "+(a/b));
		}
			catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("After catch");
	}
}
