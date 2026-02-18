import java.util.Scanner;
public class Binomeal_cofficient {
        public static int printFactorial(int n){
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void Bino_coff(int n,int r){
        int fact_n = printFactorial(n);
        int fact_r = printFactorial(r);
        int fact_nmr = printFactorial(n-r);

        int answer = fact_n/(fact_r*fact_nmr);

        System.out.println("Binomeal Cofficient is : "+ answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();

        Bino_coff(n,r);

        sc.close();
    }
}
