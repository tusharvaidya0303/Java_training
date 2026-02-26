package ClassAndObject;
class Circle{
    int radius;
//    Constructor
    Circle(int radius){
        this.radius=radius;
    }

//    method to calculate area
    double area(){
        return 3.14 * radius * radius;
    }
//    method to calculate circumference
    double circumference(){
        return 2 * 3.14 * radius;
    }
//    method to display
    void display(){
        System.out.println("Radius of Circle is : "+radius);
        System.out.println("Area of Circle is : "+area());
        System.out.println("Circumference is : "+circumference());
        System.out.println("----------------------------------");
    }
}

public class Circle_calc {
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(3);
        Circle obj3 = new Circle(8);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
