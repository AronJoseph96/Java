/* Using access field inside same class without object create a class Rectangle with
 a field length and a method display(). Inside the method, directly access length and
 print it without using any object.
@Aron*/


class Rectangle{
    int length = 10;
    void display(){
        System.out.println("Length: " +length);
    }
}
public class Main3{
    public static void main(String args[]){
        System.out.println("Aron Joseph\tRoll no: 6\n--------------------\n");
        Rectangle r1 = new Rectangle();
        r1.display();
    }
}
