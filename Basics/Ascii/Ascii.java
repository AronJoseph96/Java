import java.util.Scanner;
public class Ascii{
	public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
        	System.out.print("Enter a character: ");
        	char c = s.next().charAt(0);
        	int ascii = (int)c;
		System.out.println("ASCII value of '" +c+ "' is: " +ascii);
    }
}
