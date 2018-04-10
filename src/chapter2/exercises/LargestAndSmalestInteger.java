package chapter2.exercises;

import java.util.Scanner;
/*
Application reads 5 integers and determines minimum and maximum
 */

public class LargestAndSmalestInteger {

  public static void main(String[] args) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    Scanner _scanner = new Scanner(System.in);

    System.out.println("Enter 5 integers:");
    for (int i = 0; i < 6; i++) {
      int current = _scanner.nextInt();
      if (current > max) {
        max = current;
      }
      if (current < min) {
        min = current;
      }
    }
    System.out.printf("Minimum value is %d, maximum value is %d", min, max);
  }
}
