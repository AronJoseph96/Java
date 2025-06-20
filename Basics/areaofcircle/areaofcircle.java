/* Write a java program to compute the area of a circle(given radius) @Aron*/

import java.util.Scanner;
class areaofcircle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = s.nextInt();
		double a;
		a = 3.14*(r*r);
		System.out.println("Area of circle ->  "+a);
	}
}	