
import java.util.*;

public class factorial {
    public static void printFactorial(int n){
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of no. is : "+factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        printFactorial(n);
        sc.close();
    }
}
