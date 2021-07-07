package Week2_Lab;

public class Operations {

	public static void main(String[] args) {
		int i =10;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		int j = i++;
		int k = ++i;
		System.out.println(j);
		System.out.println(k);
		
		int ii = 20;
		System.out.println("Decrement Operator");
		System.out.println(ii);
		System.out.println(ii--);
		System.out.println(ii);
		
		int jj =ii--;
		int kk=--ii;
		System.out.println(jj);
		System.out.println(kk);
		
		int ik = 15;
		ik+=10;
		System.out.println(ik);
		ik-=20;
		System.out.println(ik);
		ik*=5;
		System.out.println(ik);
		ik/=5;
		System.out.println(ik);
		ik%=3;
		System.out.println(ik);
		int ks = 15;
		System.out.println(ks%4);
		
	}
}
