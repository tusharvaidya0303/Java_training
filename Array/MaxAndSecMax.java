package Array;
import java.util.Scanner;
public class MaxAndSecMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements : ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int Max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr){
            if (num>Max){
                secondMax = Max;
                Max = num;
            } else if (num > secondMax && num !=Max) {
                secondMax=num;
            }
        }
        System.out.println("Maximum Num is : "+Max);
        System.out.println("SecondMax Num is : "+secondMax);
        sc.close();

    }
}
