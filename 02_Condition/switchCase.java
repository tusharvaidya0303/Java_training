
import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int num = sc.nextInt();
// Greet
//        switch(num){
//            case 1 : System.out.println("Hello");
//            break;
//            case 2 : System.out.println("Namasta");
//            break;
//            case 3 : System.out.println("Bojour");
//            break;
//            default : System.out.println("Invalid number");

// Day of Week
        switch(num){
            case 1 : System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5 : System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            case 7 : System.out.println("Sunday");
                break;
            default : System.out.println("Only 7 days in a week");
        }
        sc.close();
    }
}
