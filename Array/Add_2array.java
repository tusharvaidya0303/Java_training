package Array;
import java.util.*;
public class Add_2array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,10};
        int[] sum=new int [arr1.length];
        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println("Sum is : "+ sum[i]);
        }
        sc.close();
    }
    
}
