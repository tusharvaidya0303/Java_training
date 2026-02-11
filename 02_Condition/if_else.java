
package Condition;
import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is an Even number");
        }
        else{
            System.out.println(num+" is an Odd number");
        }
        sc.close();
    }
    
}
