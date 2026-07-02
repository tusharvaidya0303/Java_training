public class CenterTriangle {

    public static void printCenterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printCenterTriangleInverted(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printCenterTriangleAlphabet(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (ch+k-1));
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char)(ch + l - 1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        printCenterTriangle(n);
        System.out.println("Inverted");
        printCenterTriangleInverted(n);
        System.out.println("Alphabet");
        printCenterTriangleAlphabet(n);
    }
}
