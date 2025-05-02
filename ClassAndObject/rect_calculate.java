package ClassAndObject;
import java.util.*;
class Rectangle{
    double length;
    double width;

//    Constructor
    Rectangle(double length,double width){
            this.length=length;
            this.width=width;
        }

//  method for area
    double area(){
        return length*width;
    }

//   method for parameter
    double parameter() {
        return 2 * (length + width);
    }

//   method to display
    void display(){
            System.out.println("Length of rectangle : "+length);
            System.out.println("Width of rectangle : "+width);
            System.out.println("Area of rectangle : "+area());
            System.out.println("parameter of rectangle is : "+parameter());
        }
    }
public class rect_calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle ");
        int length= sc.nextInt();
        System.out.print("Enter width of rectangle ");
        int width= sc.nextInt();
        Rectangle obj=new Rectangle(length,width);
        obj.display();
    }
}
