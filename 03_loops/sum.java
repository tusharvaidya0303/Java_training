//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int choice = 0;


        do{
            System.out.println("Enter the number : ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            }else{
                oddSum += number;
            }
            System.out.println("Do you want to continue? Press1 for yes or 0 for no");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of Even numbers : "+evenSum);
        System.out.println("Sum of Odd numbers : "+oddSum);
    }
}
