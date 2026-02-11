import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        boolean IsPrime = true;

        if(n==2){
            System.out.println(n+" "+ "is a prime number");
        }else{
                for(int i = 2 ; i<= Math.sqrt(n); i++){
                    if(n%10==0){          // n is a multiple of i (i is not equla to 1 or n)
                    IsPrime = false;
            }
        }
        if (IsPrime == true) {
            System.out.println(n+" "+ "is a prime number");
        }else{
            System.out.println(n+" "+"is not a prime number");
        }
        }
        sc.close();
    }
}