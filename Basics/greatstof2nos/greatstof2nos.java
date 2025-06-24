import java.util.Scanner;
class greatstof2nos{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 nos: ");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b){
			System.out.println("Greatest = "+a);
		}
		else{
			System.out.println("Greatest = "+b);
		}
	}
}