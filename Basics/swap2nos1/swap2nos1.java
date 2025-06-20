/* prg to swap 2 nos. Meth-1  @Aron */

import java.util.Scanner;
class swap2nos1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("----Method 1---- ");
		System.out.println("Enter 2 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("\n");
		System.out.println("----Method 2----");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("\n");
		System.out.println("----Method 3----");
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
		