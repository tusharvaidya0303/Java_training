
import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Radius of circle :");
        int r = sc.nextInt();

        double area = 3.14 * r * r;
        System.out.print("The area of circle is :");
        System.out.println(area);

        sc.close();
    }
}
