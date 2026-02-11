//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the number : ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                int evenSum += number;
            }else{
                int oddSum += number;
            }
            
        }
    }
}
