public class DoubleUpperTriangle {

    static void printDoubleUpperTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=  i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printDoubleUpperTriangle(n);
    }
}
