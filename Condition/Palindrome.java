package Condition;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num : ");

//        Sum of Palindrome
//        int a = sc.nextInt();
//        int a=123;
//        int sum=0;
//        while(a>0){
//            sum=sum+a%10;
//            a=a/10;
//        }
//        System.out.println(sum);

//        Check whether its a palindrome or not.
        int a = sc.nextInt();
        int original =a;
        int reverse =0;
        while(a>0){
            int digit =a%10;
            reverse=reverse*10+digit;
            a=a/10;
        }
        if(original==reverse) {
            System.out.println("Its Palindrome");
        }
            else{
                System.out.println("Its not Palandrome");
            }
            sc.close();
        }

    }
