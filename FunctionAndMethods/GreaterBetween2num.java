package FunctionAndMethods;
import java.util.*;
public class GreaterBetween2num {
    public static void greater(int a,int b){
        if(a>b){
            System.out.println(a+" is the greatest num.");
        } else if (a==b) {
            System.out.println("Both are Equal");
        }else
            System.out.println(b+" is the greater num.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a=sc.nextInt();
        System.out.print("Enter second no. : ");
        int b= sc.nextInt();
        greater(a,b);
    }
}
