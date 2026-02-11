package loops;
import java.util.*;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to print : ");
        int a = sc.nextInt();
        int i=1;
        while( i <= a){
            System.out.println("Hello World!");
            i++;
        }
        sc.close();
    }
}
