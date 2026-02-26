package TwoDarray;

public class Max_Min {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>Max){
                    Max=arr[i][j];
                } if (arr[i][j]<Min) {
                    Min=arr[i][j];
                }
            }
        }
        System.out.println("Maximum Value : "+Max);
        System.out.println("Minimum Value : "+Min);
    }
}
