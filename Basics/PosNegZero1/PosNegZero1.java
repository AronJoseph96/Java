import java.util.Scanner;
class PosNegZero1 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:\t");
		int n = s.nextInt();

		if(n==0){
			System.out.println("Zero");
		}else if(n>0) {
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
	}
}
