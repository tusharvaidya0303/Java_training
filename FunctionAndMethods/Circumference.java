package FunctionAndMethods;
import java.util.*;
public class Circumference {
    public static double circumOfCircle(double r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();

        System.out.println("Circumference of Circle is : "+circumOfCircle(r));
    }
}
