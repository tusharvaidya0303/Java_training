package Inheritance;
class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void calculateArea(){
        System.out.println("Area of Circle is : "+ 3.14*radius*radius);
    }
}
public class Single_level_2 {
    public static void main(String[] args) {
        Circle obj = new Circle(5);
        obj.draw();
        obj.calculateArea();
    }
}
