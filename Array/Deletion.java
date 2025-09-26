package Array;
import java.util.Scanner;
public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter Elements : ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter index for Deletion : ");
        int loc = sc.nextInt();
        for (int i=loc;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        for (int i=0;i<size;i++){             //Can't use for-each loop
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}
