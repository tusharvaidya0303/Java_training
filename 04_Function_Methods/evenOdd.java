
import java.util.*;
public class evenOdd {
    public static void CheckEvenOdd(int a){
        if(a%2==0){
            System.out.print(a+" iS an Even number.");
        }else
            System.out.println(a+" is an Odd number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int a = sc.nextInt();
        CheckEvenOdd(a);
        sc.close();
    }
}
