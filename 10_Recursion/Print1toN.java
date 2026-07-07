public class Print1toN {
    public static void printN(int current,int n) {
        if (current > n) {
            return;
        }
        System.out.print(current+" ");
        printN(current+1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        printN(1,n);
    }
}
