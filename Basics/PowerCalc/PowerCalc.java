
import java.util.Scanner;
class PowerCalc{
	public static int power(int a, int b){
		if(b!=0){
			return  a*power(a,b-1);}
		else{
			return 1;
		}
	}
	public static void main(String[] args){
		System.out.println("Aron Joseph\tRoll no:6\n--------------------\n");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");	
		int a = s.nextInt();
		System.out.print("Enter the power of "+a+" : ");
		int b = s.nextInt();
		PowerCalc c1 = new PowerCalc(); 
		int result = power(a,b);
		System.out.println("\n"+a+"^"+b+ " is " +result);
	}
}
		