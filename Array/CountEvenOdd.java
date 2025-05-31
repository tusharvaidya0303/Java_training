package Array;
import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Numbers : ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int EvenCount =0;
        int OddCount =0;
        for (int num : arr){
            if (num % 2 == 0){
                EvenCount++;
            }else {
                OddCount++;
            }
        }
        System.out.println("No. of evens in array : "+EvenCount);
        System.out.println("No. of Odds in array : "+OddCount);
    }
}
