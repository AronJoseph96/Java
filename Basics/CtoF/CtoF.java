import java.util.Scanner;
class CtoF{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius :\t");
		Double c = s.nextDouble();
		Double f = (c*1.8)+32 ;
		System.out.println("\nFahrenheit : "+f);
	}
}