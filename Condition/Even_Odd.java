package Condition;
import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Num : ");
//        int a=sc.nextInt();
//
//        if(a%2==0){
//            System.out.println("Its an Even num");
//        }else
//            System.out.println("Its an Odd num");

//Check whether Adult or not
        System.out.println("Enter your age : ");
        int a=sc.nextInt();

        if(a>=18){
            System.out.println("You are an Adult and eligible to Vote.");
        }else
            System.out.println("Sorry! you are not an Adult.");
        sc.close();
    }
}
