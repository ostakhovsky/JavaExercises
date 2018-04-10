package chapter2.exercises;

import java.util.Scanner;


/*
Write an application that reads two integers,
determines whether the first is a multiple of the second and prints the result.
 */

public class Multiples_2_26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 integers: ");
    int first = input.nextInt();
    int second = input.nextInt();
    if (first % second == 0) {
      System.out.printf("%d = %d * %d", first, first / second, second);
    } else {
      System.out.printf("%d is not a multiple of %d", first, second);
    }
  }
}
