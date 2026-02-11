
public class Full_Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("inverse ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Diamond Shape");
        // Print the upper half of the diamond it can only be printed in odd numbers.
        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = 5 - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
