/*Write a Java program that: Asks the user how many numbers they want to
enter. Stores the numbers in an array. Calculates and prints:
1.The sum of all the elements
2.The average of the elements
3.The maximum value
4.The minimum value
5.How many elements are even and how many are odd
6.prints the array in reverse order. @Aron*/

import java.util.Scanner;
class arr2 {
	public static void main(String args[]){
		int sum = 0;
		int even_count = 0;
		int odd_count = 0;
		double avg;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter total numbers you want to enter:\t");
		int n = s.nextInt();
		if(n<=0){
			System.out.println("Number of elements must be greater than 0.");
			return;
		}
		int[] arr = new int[n];
		System.out.println("Enter the elements:- ");
		arr[0] = s.nextInt();
		sum = arr[0];
		int max = arr[0];
		int min = arr[0];
		if(arr[0] % 2 == 0){
			even_count++;
		}else{
			odd_count++;
		}
		for(int i =1; i<n; i++){
			arr[i] = s.nextInt();
			sum += arr[i];
			if(arr[i]%2 == 0){
				even_count++;
			}else{
				odd_count++;
			}
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		avg = (double) sum / n;

		System.out.println("Sum of " + n + " numbers is " + sum);
		System.out.println("Average = " +avg);
		System.out.println("Maximum = " +max);
		System.out.println("Minimum = " +min);
		System.out.println("Total even numbers present = "+ even_count);
		System.out.println("Total odd numbers present = "+ odd_count);
	}
}