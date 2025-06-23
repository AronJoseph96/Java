/* Write a Java program to print all natural numbers from
 1 to N using a loop.  @Aron*/

import java.util.Scanner;
class NatNumb{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a natural number : ");
		int n = s.nextInt();
		System.out.println("----Natural numbers from 1 to "+n+"----");
		int i;
		for(i=1;i<=n;i++){
			System.out.print(i+" ");
		}
	}
}
