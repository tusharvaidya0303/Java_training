package FunctionAndMethods;
import java.util.Scanner;
public class practical_Questions {

//    print n Natural numbers
//    public static void natural(int n){
//        for(int i=1;i<=n;i++){
//            System.out.print(i+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value of n : ");
//        int n=sc.nextInt();
//        System.out.println("Natural numbers up to " + n + " is :");
//        natural(n);
//    }

//    Print even num in range
    public static void range(int start,int end){
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of range : ");
        int start=sc.nextInt();
        System.out.println("Enter end of range : ");
        int end=sc.nextInt();
        System.out.println("Even num in range is : ");
        range(start,end);
        sc.close();
    }
}
