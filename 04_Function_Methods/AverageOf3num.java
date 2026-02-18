
import java.util.*;
public class AverageOf3num {
    public static void average(int a,int b,int c,int avg){
        avg=(a+b+c)/3;
        System.out.print("The average of 3 no. is : "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a= sc.nextInt();
        System.out.print("Enter second no. : ");
        int b= sc.nextInt();
        System.out.print("Enter third no. : ");
        int c= sc.nextInt();
        int avg=0;

        average(a,b,c,avg);
        sc.close();
    }
}
