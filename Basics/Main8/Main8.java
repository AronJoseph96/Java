/* Create a class MathTool with a method printSquare(int num) that prints the square of the
 number passed. Call it from the main method with a number.
 @Aron*/

import java.util.Scanner;
 class MathTool{
    void printSquare(int num){
        int square = num*num;
        System.out.println("Square of "+num+" is "+square);
    }
 }
 
 public class Main8{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Aron Joseph\tRoll no: 6\n--------------------\n");
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        MathTool m1 = new MathTool();
        m1.printSquare(num);
    }
 }