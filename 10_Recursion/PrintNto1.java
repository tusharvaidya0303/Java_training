public class PrintNto1 {
    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        printNto1(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printNto1(n);
    }
}
