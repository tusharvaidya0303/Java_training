
import java.util.*;
public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no. : ");
        int a = sc.nextInt();

        int i=1;
        do{
            System.out.println("Hello World!");
            i++;
        }
        while(i<=a);
        sc.close();
    }
}
