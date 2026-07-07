public class PrintNtimes {
    public static void printNtimes(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("Tushar ");
        printNtimes(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNtimes(n);
    }
}
