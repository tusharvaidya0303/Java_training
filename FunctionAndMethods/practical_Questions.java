package FunctionAndMethods;
import java.util.Scanner;
public class practical_Questions {

//    print n Natural numbers
    public static void natural(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n=sc.nextInt();
        System.out.println("Natural numbers up to " + n + " is :");
        natural(n);
    }
}
