package Array;

import java.util.Scanner;

public class MinAndSecMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements : ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int Min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr){
            if (num<Min){
                secondMin = Min;
                Min = num;
            } else if (num < secondMin && num !=Min) {
                secondMin=num;
            }
        }
        System.out.println("Minimum Num is : "+Min);
        System.out.println("SecondMin Num is : "+secondMin);
    }
}
