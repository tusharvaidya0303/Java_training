package FunctionAndMethods;
import java.util.*;
import java.util.stream.StreamSupport;

public class factorial {
    public static void printFactorial(int a){
        int factorial =1;
        for(int i=a;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of no. is : "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int a = sc.nextInt();
        printFactorial(a);
        sc.close();
    }
}
