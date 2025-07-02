/* Write a Java program that:
Accepts an array of integers.
Loops through the array to find and print the maximum number in it.*/

import java.util.Scanner;
class arr1{
	public static void main(String args[]){
		System.out.println("Enter total numbers u want to add in array: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] num = new int[n];
		System.out.println("Enter "+n+" numbers : ");
		for(int i=0;i<n;i++){
			num[i] = s.nextInt();
		}
		int max = num[0];
		for(int i=0;i<n;i++){
			if(num[i] > max){
				max = num[i];
			}
		}
		System.out.println("The maximum is "+max);
	}
}