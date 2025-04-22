package Array;
import java.util.*;
public class Input_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        System.out.println("Enter array Values : ");
        int[] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
//         For printing array
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
         }

        // For Adding array
        // int sum = 0;
        // for(int j=0;j<arr.length;j++){
        //     sum=sum+arr[j];
        // }
        // System.out.println("Addition of arr is : "+sum);

        // For finding maximum no. in array
        // int max=arr[0];
        // for(int j=0;j<arr.length;j++){
        //     if(arr[j]>max){
        //         max=arr[j];
        //     }
        // }
        // System.out.println("Maximum value is : "+max);

        // For finding minimum no. in array
//        int min=arr[0];
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]<min){
//                min=arr[j];
//            }
//        }
//        System.out.println("Minimum value is : "+min);
        sc.close();
    }
}
