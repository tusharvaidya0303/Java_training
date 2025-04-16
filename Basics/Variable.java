package Basics;
import java.util.Scanner;

public class Variable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter no. 1 : ");
    int a = sc.nextInt();
  
    System.out.print("Enter no. 2 : ");
    int b = sc.nextInt();

    int sum= a+b;
    System.out.print("The sum is : ");
    System.out.println(sum);
    sc.close();
  }
}

