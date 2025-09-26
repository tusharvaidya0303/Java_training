package Array;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter Elements : ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter index for Location : ");
        int loc = sc.nextInt();
        System.out.println("Enter element for insertion : ");
        int elem = sc.nextInt();

        for (int i=size;i>loc;i--){
            arr[i]=arr[i-1];
        }
        arr[loc]=elem;
        size++;
        for (int print : arr){
            System.out.println(print+" ");
        }
        sc.close();
    }
}
