import java.util.Scanner;

public class arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        if(total%2==0){
            System.out.println(total + " is Even");
        }else{
            System.out.println(total + " is Odd");
        }
        sc.close();
    }
}