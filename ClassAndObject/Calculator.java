package ClassAndObject;
import java.util.*;
class Calculate{
    int a,b;
//    constructor
    Calculate(int a,int b){
        this.a=a;
        this.b=b;
    }
    int sum(){
        return a+b;
    }
    int diff(){
        return a-b;
    }
    int multi(){
        return a*b;
    }
    int div(){
        int ans=0;
        if(b!=0){
            ans= a/b;
        }
        return ans;
    }

}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int a = sc.nextInt();
        System.out.print("Enter Second num : ");
        int b = sc.nextInt();
        System.out.print("Select (+,-,*,/) : ");
        char c = sc.next().charAt(0);
        Calculate obj = new Calculate(a,b);
        switch (c){
            case '+' :
                System.out.println(a + " + " + b + " = " +obj.sum());
                break;
            case '-' :
                System.out.println(a + " - " + b + " = " +obj.diff());
                break;
            case '*' :
                System.out.println(a + " * " + b + " = " +obj.multi());
                break;
            case '/' :
                System.out.println(a + " / " + b + " = " +obj.div());
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}
