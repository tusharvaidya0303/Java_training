package FunctionAndMethods;
import java.util.*;
public class numTableFunc {
    public static void table(int num){
        for (int i = 1; i <= 10; i++ )
        {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        table(num);
        sc.close();
    }
}
