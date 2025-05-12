package Encapsulation;
import java.util.*;
class Rectangle{
    private int Length;
    private int Width;

    public void setLength(int Length) {
        this.Length = Length;
    }
    public void setWidth(int Width) {
        this.Width = Width;
    }

    public int getArea() {
        return Length*Width;
    }

    public int getPerimeter() {
        return 2*(Length+Width);
    }
}
public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int a = sc.nextInt();
        System.out.print("Enter Width : ");
        int b = sc.nextInt();
        Rectangle obj = new Rectangle();
        obj.setLength(a);
        obj.setWidth(b);
        System.out.println("Area is : "+obj.getArea());
        System.out.println("Perimeter is : "+obj.getPerimeter());
    }
}
