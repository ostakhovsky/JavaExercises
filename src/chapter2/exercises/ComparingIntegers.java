package chapter2.exercises;
/*
2.16 (Comparing Integers) Write an application that asks the user to enter two integers, obtains them from the user
and displays the larger number followed by the words "is larger". If the numbers are equal, print the message
"These numbers are equal". Use the techniques shown in Fig. 2.15 .
 */

import java.util.Scanner;


public class ComparingIntegers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int number1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int number2 = input.nextInt();

    if (number1 > number2) {
      System.out.printf("%d is larger ", number1);
    } else if (number2 > number1) {
      System.out.printf("%d is larger ", number2);
    } else {
      System.out.println("These numbers are equal");
    }
  }
}
