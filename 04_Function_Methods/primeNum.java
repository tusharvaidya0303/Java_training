
import java.util.*;
public class primeNum {
    public static void checkPrimeNum(int a,int count){
        for(int i=1;i<=a;i++){
            if(a%i==0) {
                count++;
            }
        }
        if(count==2){
                System.out.print(a+" is a Prime number");
        }else
                System.out.println(a+" is not a prime number");
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter the no. : ");
        int a = sc.nextInt();
        checkPrimeNum(a,count);
        sc.close();
    }
}
