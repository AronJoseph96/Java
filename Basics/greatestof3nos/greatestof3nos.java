/*This prg is to find the greatest of 3 nums
@Aron */

import java.util.Scanner;
class greatestof3nos {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int g;
		if(a>b){
			if(a>c){
				g = a;
			}else{
				g = c;
			}
		}else if(b>c){
			g = b;
		}else{
			g = c;
		}
		System.out.println("Greatest number = " + g);
	}
}
