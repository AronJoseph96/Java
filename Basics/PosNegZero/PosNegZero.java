import java.util.Scanner;
class PosNegZero {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = s.nextInt();
		if(a==0){
			System.out.println("The number is Zero");
		}else if(a>0){
			System.out.println("The number is Positive");
		}else{
			System.out.println("The number is Negative");
		}
	}
}