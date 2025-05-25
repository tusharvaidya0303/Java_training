package Exception_Handling;
import java.util.*;
public class Fourth_Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            str = null;
        }
        try {
            System.out.println(str);
            System.out.println("Length : "+str.length());
        } catch (Exception e) {
            System.out.println("The string is Empty");
        }
        sc.close();
    }
}

