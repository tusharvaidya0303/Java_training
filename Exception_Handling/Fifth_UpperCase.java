package Exception_Handling;
import java.util.Scanner;
public class Fifth_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            str = null;
        }
        try {
            System.out.println("String entered : "+str);
            System.out.println("UpperCase : "+str.toUpperCase());
        } catch (Exception e) {
            System.out.println("The string is Empty");
        }
        sc.close();
    }
}
