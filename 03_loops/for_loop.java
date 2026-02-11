package loops;
import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int a = sc.nextInt();
        for(int i = 0; i <= a; i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
