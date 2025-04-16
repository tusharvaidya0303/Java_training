package Condition;
import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int num = sc.nextInt();

        switch(num){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namasta");
            break;
            case 3 : System.out.println("Bojour");
            break;
            default : System.out.println("Invalid number");
        }
        sc.close();
    }
}
