import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n==2){
            System.out.println(n+" "+ "is a prime number");
        }else{
                for(int i = 2 ; i<= Math.sqrt(n); i++){
                    if(n%i==0){                                  // n is a multiple of i (i is not equla to 1 or n)
                    isPrime = false;
                    break;                                      //stop checking once divisor is found
            }
        }
        if (isPrime == true) {
            System.out.println(n+" "+ "is a prime number");
        }else{
            System.out.println(n+" "+"is not a prime number");
        }
        }
        sc.close();
    }
}