import java.util.Scanner;
public class GCForHCF {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter 1st no. : ");
        n1=sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        n2=sc.nextInt();

        //Brute force
        // int hcf=1;
        // for(int i=1;i<=Math.min(n1,n2);i++){
        //     if(n1%i==0 && n2%i==0){
        //         hcf=i;
        //     }
        // }

        int hcf = gcd(n1,n2);
        System.out.println("HCF of "+n1+" and "+n2+" is : "+hcf);
        sc.close();
    }
}
