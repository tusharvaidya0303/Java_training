public class SumOfn {
    public static int sumOfN(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        sum=n+sumOfN(n-1);
        return sum;
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfN(n));
    }
}
