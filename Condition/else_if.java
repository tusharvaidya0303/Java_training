package Condition;
import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int num = sc.nextInt();

        if(num==1){
            System.out.println("Hello");
        }
        else if(num==2){
            System.out.println("Namastay");
        }
        else if(num==3){
            System.out.println("Bojour");
        }
        else{
            System.out.println("Invalid number");
        }
        sc.close();
    }
}
