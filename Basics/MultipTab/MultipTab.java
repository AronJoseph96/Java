/* Write a Java program to print the multiplication table
 of a given number.  @Aron*/

import java.util.Scanner;
class MultipTab {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println("Multiplication table of "+n+" :");
	int i;
        for(i=1;i<=10;i++){
		System.out.println(n+" x "+i+" = "+(n*i));
        }
    	}
}
