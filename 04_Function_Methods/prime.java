public class prime {
    boolean Prime(int n){
        if(n==2){
            System.out.println("Prime");
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0) {
                System.out.println("Not Prime");
                return false;
            }
        }
        System.out.println("Prime");
        return true;
    }
    public static void main(String[] args) {
        int a = 4;
        prime p = new prime();
        System.out.println("Result: " + p.Prime(a));
    }
}