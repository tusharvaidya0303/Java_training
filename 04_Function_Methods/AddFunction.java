
import java.util.*;
public class AddFunction {
    public static int addition(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.1 : ");
        int a= sc.nextInt();
        System.out.print("Enter no.2 : ");
        int b= sc.nextInt();
        int sum=addition(a,b);
        System.out.print("Sum of 2 no. : "+sum);
        sc.close();
    }
}
