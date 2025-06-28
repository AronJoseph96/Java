import java.util.Scanner;
public class Operations{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number:\t");
        double n1 = s.nextDouble();

        System.out.print("Enter second number:\t");
        double n2 = s.nextDouble();

        double sum = n1 + n2;
        double difference = n1 - n2;
        double product = n1 * n2;
        String quotient = (n2 != 0)? String.valueOf(n1/n2) : "Undefined";
        boolean isGreater = n1 > n2;

        System.out.println("\n---Results---");
        System.out.println("Sum:\t\t" +sum);
        System.out.println("Difference:\t" +difference);
        System.out.println("Product:\t" +product);
        System.out.println("Quotient:\t" +quotient);
        System.out.println("Is First > Second? :\t" +isGreater);
    }
}
