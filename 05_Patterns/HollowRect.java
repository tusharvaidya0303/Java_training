public class HollowRect {

    public static void printHollowRect(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner column
            for (int j = 1; j <= n; j++) {
                //cell - [i,j]
                if (i == 1 || i == n || j == 1 || j == n) {
                    //boundery cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHollowRect(5);
    }
}
