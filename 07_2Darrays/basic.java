import java.util.*;
public class basic {
        public static boolean ispresent(int matrix [][] , int key) {
        for(int i=0;i<matrix.length;i++){           //row
            for(int j=0;j<matrix[i].length;j++){    //column
                if(matrix[i][j]==key){
                    System.out.println("Key found at ("+i+", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int [3][3];
        for(int i=0;i<matrix.length;i++){           //row
            for(int j=0;j<matrix[i].length;j++){    //column
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){           //row
            for(int j=0;j<matrix[i].length;j++){    //column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        ispresent(matrix,5);
        sc.close();
    }
}
