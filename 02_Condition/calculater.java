
import java.util.*;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No. : ");
        double a = sc.nextDouble();
        System.out.print("Select Operator +,-,*,/ or % : ");
        char x = sc.next().charAt(0);
        System.out.print("Enter Second No. : ");
        double b = sc.nextDouble();

        switch(x){
            case'+' : double result = a + b;
            System.out.println(a+" + "+b+" = "+result);
            break;
            case'-' :  result = a - b;
            System.out.println(a+" - "+b+" = "+result);
            break;
            case'*' :  result = a * b;
            System.out.println(a+" * "+b+" = "+result);
            break;
            case'/' :  result = a / b;
            System.out.println(a+" / "+b+" = "+result);
            break;
            case'%' :  result = a % b;
            System.out.println(a+" % "+b+" = "+result);
            break;
            default :System.out.println("Invalid operator");
        }

        sc.close();
    }
    
}
