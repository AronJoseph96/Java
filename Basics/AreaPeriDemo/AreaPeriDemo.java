/* Write a java program to calculate area and perimeter of a rectangle
. Create object square and rectangle(use parameterized constructors)*/

class Rect
{
	double length;
	double breadth;
	Rect(int side){
		this.length = side;
	}
	Rect(int length, int breadth){
		this.length = length;
		this.breadth = breadth
	}
	void areaCalc(){
		double areaSq = this.length*this.length;
		double areaRect = this.length*this.breadth;
		System.out.println("Area of square -> "+areaSq);
		System.out.println("Area of rectangle -> "+areaRect);
	}
}
class AreaPeriDemo{
	public static void main(String args[]){
		Rect square =new Rect(33,33);
		Rect rectangle = new Rect(11,23);
		rectangle.areaCalc();
		square.areaCalc();
	}
}