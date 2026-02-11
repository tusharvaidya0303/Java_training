
import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();

        System.out.print("Enter side 2: ");
        int b = sc.nextInt();

        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
//Check whether the triangle valid or not
        if(a+b>c && b+c>a && c+a>b) {
//If triangle is valid then
            if (a==b && b==c) {
                System.out.println("Since all sides are equal");
                System.out.println("It is a Equilateral Triangle");
                System.out.println("And is valid.");
            } else if (a==b || b==c || c==a) {
                System.out.println("Two sides are equal ");
                System.out.println("It is a Isosceles Triangle");
                System.out.println("and is valid.");
            } else
                System.out.println("Since all sides are unequal");
                System.out.println("It is a Scalene Triangle");
                System.out.println("and is also valid.");
            } else
                System.out.println("Its an Invalid Triangler");
            sc.close();
        }

    }
