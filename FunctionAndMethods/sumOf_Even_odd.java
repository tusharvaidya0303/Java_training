package FunctionAndMethods;
import java.util.*;
public class sumOf_Even_odd {
    public static void sumOfOdd(int n){
        int sum =0;
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                sum=sum+i;
            }
        }
        System.out.println("Sum of Odd no. : "+sum);
    }
    public static void sumOfEven(int n) {
        int sum =0;
        for(int i=1;i<=n;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of Even numbers: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n : ");
            int n = sc.nextInt();

        System.out.println("Choose option:");
        System.out.println("1. Sum of Odd numbers");
        System.out.println("2. Sum of Even numbers");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sumOfOdd(n);
                break;
            case 2:
                sumOfEven(n);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        sc.close();
    }
}
