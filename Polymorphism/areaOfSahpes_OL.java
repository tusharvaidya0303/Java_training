package Polymorphism;
// Create a class that has overloaded methods for displaying the area of different shapes.

class Area{
    double shape(double radius)
    {
        return 3.14 * radius*radius;
    }
    int shape (int side){
        return side*side;
    }
    double shape(double base,double height){
        return 0.5*base*height;
    }
    int shape(int length,int bredth){
        return length*bredth;
    }

}
public class areaOfSahpes_OL {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Area of circle: "+obj.shape(20));
        System.out.println("Area of Square: "+obj.shape(5));
        System.out.println("Area of Triangle:"+obj.shape(4.0,6.0));
        System.out.println("Area of Reatangle:"+obj.shape(4,6));
    }
}
