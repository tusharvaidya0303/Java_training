package TwoDarray;

public class sumOfRows {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        for (int i=0;i< arr.length;i++){
            int RowSum=0;
            for (int j=0;j<arr[i].length;j++){
                RowSum+=arr[i][j];
            }
            System.out.println("Sum of Rows "+i+" : "+RowSum);
        }
    }
}
