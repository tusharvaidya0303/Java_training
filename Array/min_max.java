package Array;
import java.util.*;
public class min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }if (arr[j] < min) {
                        min = arr[j];
                    }
                }
                System.out.println("Maximum value is : " + max);
                System.out.println("Minimum value is : " + min);
            }
        }
