public class HollowRect {

    void printHollowRect(int totRows, int totCols) {
        //outer loop
        for (int i = 1; i <= totRows; i++) {
            //inner column
            for (int j = 1; j <= totCols; j++) {
                //cell - [i,j]
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
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
        HollowRect obj = new HollowRect();
        obj.printHollowRect(4, 5);
    }
}
