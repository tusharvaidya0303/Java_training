package ClassAndObject;
abstract class shape{
    abstract void Area(double r,double l,double b);
     void Method (){
        System.out.println("===================//=====================");
    }
}

class CircleNew extends shape{
    void  Area (double r,double l,double b ){
        double a = 3.14*r*r;
        System.out.println("Area of circle is : "+a);
    }
}

class rectangle1 extends shape{
    void Area (double r,double l,double b ){
        double a= l*b;
        System.out.println("Area of rectangle is : "+a);
    }
}
public class abstractClass2 {
    public static void main(String[] args) {
        shape obj = new CircleNew();
        obj.Area(3,0,0);
        obj.Method();

        shape obj1 = new rectangle1();
        obj1.Area(0,5,6);
        obj1.Method();

    }
}
