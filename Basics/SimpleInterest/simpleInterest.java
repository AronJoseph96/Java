import java.util.Scanner;
class simpleInterest{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principle amount:\t");
		Double p = s.nextDouble();

		System.out.println("Enter Rate of Interest:\t");
		Double r = s.nextDouble();

		System.out.println("Enter Time period (in Years):\t");
		Double t = s.nextDouble();
		Double SI = (p*r*t)/100;
		System.out.println("\nSimple interest : "+SI);
	}
}