/* Write a Java program that prints the numbers from 1 to 100, but:
1. For multiples of 3, print "Fizz" instead of the number.
2. For multiples of 5, print "Buzz" instead of the number.
3. For numbers which are multiples of both 3 and 5, print "FizzBuzz". */

class buzz{
	public static void main(String args[]){
		for(int i=1; i<=100; i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			else if(i%3==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i+"  ");
			}
		}
	}
}