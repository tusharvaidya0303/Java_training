package FunctionAndMethods;
import java.util.*;
public class product {
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.1 : ");
        int a= sc.nextInt();
        System.out.print("Enter no.2 : ");
        int b= sc.nextInt();

        System.out.println("Product of 2 no. : "+calculateProduct(a,b));
    }

}
